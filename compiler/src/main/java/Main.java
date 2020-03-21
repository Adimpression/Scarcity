import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.IntervalSet;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Ravindranath Akila on 2019-09-14.
 */
// Check main state missing
// Check main state does not match file name
final public class Main {

    private static String source;

    private static String destination;


    public static void main(String[] args) throws IOException, TemplateException, InterruptedException {

        final ExecutorService executorService = Executors.newFixedThreadPool(1);

        source = args[0];
        destination = args[1];

        if (!new File(source).exists()) {
            throw new RuntimeException("[ERROR:STATE:COMPILER] Unable to locate 'source':" + source);
        }

        if (new File(destination).exists()) {

            if (!deleteDirectory(new File(destination))) {
                //throw new RuntimeException("Unable to delete 'destination'");
            }
        }
        if (new File(destination).mkdir()) {
            System.out.println("[WARNING:STATE:COMPILER] Failed to create 'destination'.");
        }

        final Configuration cfg = new Configuration(new Version("2.3.23"));

        cfg.setClassForTemplateLoading(Main.class,
                "/");

        cfg.setDefaultEncoding("UTF-8");

        final Template template = cfg.getTemplate("state.proto.ftl");

        final List<Future<?>> futures;

        try (final Stream<Path> walk = Files.walk(Paths.get(source))) {
            futures = walk
                    .filter(path -> Files.isRegularFile(path) && !path.toString()
                            .contains(".git/") && !path.toString()
                            .contains(".gitignore"))
                    .map(Path::toString)
                    .map(x -> executorService.submit(() -> {
                        try {
                            process(template,
                                    x,
                                    destination);
                        } catch (final Throwable e) {
                            throw new RuntimeException(x,
                                    e);
                        }
                    }))
                    .collect(Collectors.toList());
        } catch (final IOException e) {
            throw new RuntimeException(e);
        }

        for (final Future<?> future : futures) {
            try {
                future.get();
            } catch (final Throwable t) {
                throw new RuntimeException(t);
            }
        }

        executorService.shutdown();
        executorService.awaitTermination(1,
                TimeUnit.MINUTES);
    }

    private static void process(final Template template, final String fullFileName, final String basen) throws IOException, TemplateException {

        try {
            final int lastPeriod = fullFileName.lastIndexOf('.');

            final int lastSlash = fullFileName.lastIndexOf(File.separatorChar);

            final String fileNameWithoutExtension = fullFileName.substring(lastSlash + 1,
                    lastPeriod);

            System.out.println("\t" + fullFileName.substring(lastSlash + 1) + "(FILE)");

            //Created outline files may be misspelled. Detection here is invaluable.
            if (!fullFileName.endsWith(".txt")) {
                System.out.println("\n[WARNING:STATE:COMPILER] Only .txt files should be included. Noticed:" + fullFileName);
                return;
            }

            final Map<String, Object> templateData = new HashMap<>();

            final ANTLRFileStream input = new ANTLRFileStream(fullFileName,
                    "UTF-8");
            final StateLexer stateLexer = new StateLexer(input);
            final CommonTokenStream commonTokenStream = new CommonTokenStream(stateLexer);
            final StateParser stateParser = new StateParser(commonTokenStream);

            stateParser.setErrorHandler(new ANTLRErrorStrategy() {

                @Override
                public void reset(final Parser parser) {

                }

                @Override
                public Token recoverInline(final Parser parser) throws RecognitionException {

                    final IntervalSet expectedTokens = parser.getExpectedTokens();
                    final StringBuilder stringBuffer = new StringBuilder();

                    for (int i = 0; i < expectedTokens.size(); i++) {
                        stringBuffer.append(expectedTokens)
                                .append(",");
                    }

                    throw new RuntimeException(
                            "\n[ERROR:STATE:COMPILER] Syntax error inside here:>>>" + parser.getTokenStream()
                                    .getText() + "<<< " +
                                    "\n[ERROR:STATE:COMPILER] Found:" + parser.getCurrentToken()
                                    .getText() + ". " +
                                    "\n[ERROR:STATE:COMPILER] Expected one of these:" + stringBuffer.toString());
                }

                @Override
                public void recover(final Parser parser, final RecognitionException e) throws RecognitionException {

                    throw new RuntimeException(e);
                }

                @Override
                public void sync(final Parser parser) throws RecognitionException {

                }

                @Override
                public boolean inErrorRecoveryMode(final Parser parser) {

                    return false;
                }

                @Override
                public void reportMatch(final Parser parser) {

                }

                @Override
                public void reportError(final Parser parser, final RecognitionException e) {

                    throw new RuntimeException(e);
                }
            });


            final StateParser.MainContext mainContext = stateParser.main();
            final StateParser.StateContext stateContext = mainContext.state();

            final Set<String> v = new LinkedHashSet<>();
            final Set<C> c = new LinkedHashSet<>();
            final Set<C> cis = new LinkedHashSet<>();
            final Set<SortedSet<C>> cor = new LinkedHashSet<>();
            final Set<P> p = new LinkedHashSet<>();
            final Set<P> pis = new LinkedHashSet<>();
            final Set<SortedSet<P>> por = new LinkedHashSet<>();

            //Leave, for debug, this approach helps
            //if (fileNameWithoutExtension.contains("selection")) {
            //  System.out.println("taken");
            //}

            new ParseTreeWalker().walk(new L(v,
                            c,
                            cis,
                            cor,
                            p,
                            pis,
                            por),
                    mainContext);

            templateData.put("filename",
                    fileNameWithoutExtension);

            templateData.put("state",
                    stateContext.id()
                            .getText()
                            .replaceAll(" ",
                                    "")
                            .replaceFirst("Not",
                                    "")
                            .replaceFirst("Is",
                                    ""));

            templateData.put("imps",
                    v);
            templateData.put("cs",
                    c);
            templateData.put("cis",
                    cis);
            templateData.put("scors",
                    cor);
            templateData.put("ps",
                    p);
            templateData.put("pis",
                    pis);
            templateData.put("spors",
                    por);

            final File f = new File(basen + File.separator + fileNameWithoutExtension.replaceAll("\\.",
                    "\\" + File.separator) + File.separator + "index.proto");
            final File parent = f.getParentFile();
            if (!parent.exists() && !parent.mkdirs()) {
                throw new IllegalStateException("\n[ERROR:STATE:COMPILER]:Couldn't create dir: " + parent);
            }

            f.createNewFile();

            final FileWriter out = new FileWriter(f);
            template.process(templateData,
                    out);
            out.flush();
        } catch (final IOException e) {
            throw new IOException("\n[ERROR:STATE:COMPILER]:" + fullFileName,
                    e);
        }
    }

    private static boolean deleteDirectory(final File directoryToBeDeleted) {

        final File[] allContents = directoryToBeDeleted.listFiles();
        if (allContents != null) {
            for (final File file : allContents) {
                deleteDirectory(file);
            }
        }
        return directoryToBeDeleted.delete();
    }
}

