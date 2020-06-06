// Generated from State.g4 by ANTLR 4.3

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * This class provides an empty implementation of {@link StateListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class L implements StateListener {

    private final Set<String> v;

    private final Set<C> c;

    private final Set<C> cis;

    private final Set<SortedSet<C>> cor;

    private final Set<P> p;

    private final Set<P> pis;

    private final Set<SortedSet<P>> por;


    private int index = 1;//'is' and 'not' refer to 0

    L(final Set<String> v, final Set<C> c, final Set<C> cis, final Set<SortedSet<C>> cor, final Set<P> p, final Set<P> pis, final Set<SortedSet<P>> por) {

        this.v = v;
        this.c = c;
        this.cis = cis;
        this.cor = cor;
        this.p = p;
        this.pis = pis;
        this.por = por;
    }


    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterRed(StateParser.RedContext ctx) {


    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitRed(StateParser.RedContext ctx) {

    }

    @Override
    public void enterDed(final StateParser.DedContext ctx) {

        System.out.println("\t\t\t" + ctx.ed().getText() + "(DED)");

        ImportInjector.InjectImports(v, ctx);

        c.add(new C(
                index++,
                ctx.ed().getText()
                        .replaceFirst("Is ", "Is")
                        .replaceFirst("Not ", "Not")
                        .replace('/', '.')
                        .replaceAll("Is", "NOT")
                        .replaceAll("Not", "IS")
                        .replaceAll("NOT", "Not")
                        .replaceAll("IS", "Is"),
                ctx.ed().getText()
                        .replaceFirst("Is ", "Is")
                        .replaceFirst("Not ", "Not")
                        .replaceAll("Is", "NOT")
                        .replaceAll("Not", "IS")
                        .replaceAll("NOT", "Not")
                        .replaceAll("IS", "Is")
                        .replaceAll("([a-z])([A-Z]+)", "$1_$2")
                        .toLowerCase().split("/")[1],
                false));

        p.add(new P(
                index,
                ctx.ed().getText()
                        .replaceFirst("Is ", "Is")
                        .replaceFirst("Not ", "Not")
                        .replace('/', '.'),
                ctx.ed().getText()
                        .replaceFirst("Is ", "Is")
                        .replaceFirst("Not ", "Not")
                        .replaceAll("([a-z])([A-Z]+)", "$1_$2")
                        .toLowerCase()
                        .split("/")[1],
                false));

    }

    @Override
    public void exitDed(final StateParser.DedContext ctx) {

    }

    @Override
    public void enterDred(final StateParser.DredContext ctx) {

        System.out.println("\t\t\t" + ctx.red().ed().getText() + "(DRED)");

        ImportInjector.InjectImports(v, ctx);

        c.add(new C(
                index++,
                ctx.red().ed().getText()
                        .replaceFirst("Is ", "Is")
                        .replaceFirst("Not ", "Not")
                        .replace('/', '.')
                        .replaceAll("Is", "NOT")
                        .replaceAll("Not", "IS")
                        .replaceAll("NOT", "Not")
                        .replaceAll("IS", "Is"),
                ctx.red().ed().getText()
                        .replaceFirst("Is ", "Is")
                        .replaceFirst("Not ", "Not")
                        .replaceAll("Is", "NOT")
                        .replaceAll("Not", "IS")
                        .replaceAll("NOT", "Not")
                        .replaceAll("IS", "Is")
                        .replaceAll("([a-z])([A-Z]+)", "$1_$2")
                        .toLowerCase().split("/")[1],
                true));

        p.add(new P(
                index,
                ctx.red().ed().getText()
                        .replaceFirst("Is ", "Is")
                        .replaceFirst("Not ", "Not")
                        .replace('/', '.'),
                ctx.red().ed().getText()
                        .replaceFirst("Is ", "Is")
                        .replaceFirst("Not ", "Not")
                        .replaceAll("([a-z])([A-Z]+)", "$1_$2")
                        .toLowerCase()
                        .split("/")[1],
                true));
    }

    @Override
    public void exitDred(final StateParser.DredContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterDependency(StateParser.DependencyContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitDependency(StateParser.DependencyContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterMain(StateParser.MainContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitMain(StateParser.MainContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterState(StateParser.StateContext ctx) {

        System.out.println("\t\t" + ctx.getText() + "(STATE)");
    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitState(StateParser.StateContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterId(StateParser.IdContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitId(StateParser.IdContext ctx) {

    }

    @Override
    public void enterDbored(final StateParser.DboredContext ctx) {


        ctx.bored().ed().forEach(x -> System.out.println("\t\t\t" + x.getText() + "(DBORED)"));


        ImportInjector.InjectImports(v, ctx);

        final SortedSet<C> cs = new TreeSet<>();

        index++;

        ctx.bored()
                .ed()
                .forEach(edContext -> {
                    final String text = edContext.getText();

                    final String[] split = text.split("/");
                    final String splitPath = split[0];
                    final String spitName = split[1];

                    final String pureTypeNegated = spitName
                            .replaceFirst("Is ",
                                    "Is")
                            .replaceFirst("Not ",
                                    "Not")
                            .replaceFirst("Is",
                                    "NOT")
                            .replaceFirst("Not",
                                    "IS")
                            .replaceFirst("NOT",
                                    "Not")
                            .replaceFirst("IS",
                                    "Is");

                    final String fullTypeNegated = splitPath + "." + pureTypeNegated;

                    final String pureFieldNegated = pureTypeNegated
                            .replaceAll("([a-z])([A-Z]+)",
                                    "$1_$2")
                            .toLowerCase();

                    cs.add(
                            new C(index,
                                    fullTypeNegated,
                                    pureFieldNegated));
                });

        cor.add(cs);

        final SortedSet<P> ps = new TreeSet<>();

        ctx.bored()
                .ed()
                .forEach(edContext -> {
                    final String text = edContext.getText();

                    final String[] split = text.split("/");
                    final String splitPath = split[0];
                    final String spitName = split[1];

                    final String pureType = spitName
                            .replaceFirst("Is ",
                                    "Is")
                            .replaceFirst("Not ",
                                    "Not");

                    final String fullType = splitPath + "." + pureType;

                    final String pureField = pureType
                            .replaceAll("([a-z])([A-Z]+)",
                                    "$1_$2")
                            .toLowerCase();

                    ps.add(new P(
                            index,
                            fullType,
                            pureField));
                });

        por.add(ps);

    }

    @Override
    public void exitDbored(final StateParser.DboredContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterBored(StateParser.BoredContext ctx) {


    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitBored(StateParser.BoredContext ctx) {

    }

    @Override
    public void enterDid(final StateParser.DidContext ctx) {


        System.out.println("\t\t\t" + ctx.id().getText() + "(DID)");

        final String type = getType(ctx.id().getText());

        //This means is the main state, in theory. TODO: Refactor
        if (type == null) {
            return;
        }

        cis.add(new C(
                index++,
                type,
                ctx.id().getText()
                        .replaceFirst("Is ", "Is")
                        .replaceFirst("Not ", "Not")
                        .replaceAll("Is", "NOT")
                        .replaceAll("Not", "IS")
                        .replaceAll("NOT", "Not")
                        .replaceAll("IS", "Is")
                        .replaceAll("([a-z])([A-Z]+)", "$1_$2")
                        .toLowerCase(),
                false));

        pis.add(new P(
                index,
                type,
                ctx.id().getText()
                        .replaceFirst("Is ", "Is")
                        .replaceFirst("Not ", "Not")
                        .replaceAll("([a-z])([A-Z]+)", "$1_$2")
                        .toLowerCase(),
                false));


    }

    @Override
    public void exitDid(final StateParser.DidContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEd(StateParser.EdContext ctx) {


    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEd(StateParser.EdContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitTerminal(TerminalNode node) {

    }

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation does nothing.</p>
     */
    @Override
    public void visitErrorNode(ErrorNode node) {

    }

    /**
     * Created by Ravindranath Akila on 2019-09-20.
     */
    static final public class ImportInjector {

        static void InjectImports(final Set<String> v, final StateParser.DredContext redContext) {

            InjectImports(v, redContext.red().ed());
        }

        static void InjectImports(final Set<String> v, final StateParser.DedContext edContext) {

            InjectImports(v, edContext.ed());
        }

        static void InjectImports(final Set<String> v, final StateParser.EdContext edContext) {

            v.add(toImportSyntax(edContext.getText()));
        }

        static void InjectImports(final Set<String> v, final StateParser.DboredContext boredContext) {

            boredContext.bored().ed().forEach(edContext -> v.add(toImportSyntax(edContext.getText())));
        }

        private static String toImportSyntax(final String s) {

            return s.replaceAll(" ", "")
                    .replaceAll("Is", "")
                    .replaceAll("Not", "")
                    .toLowerCase()
                    .replaceAll("\\.", "/")
                    .replaceAll("([^/]+$)", "")
                    .concat("index.proto");
        }
    }

    private static String getType(final String node) {

        if (node.contains("Strings")) {
            return "repeated string";
        } else if (node.contains("String")) {
            return "string";
        } else if (node.contains("Floats")) {
            return "repeated float";
        } else if (node.contains("Float")) {
            return "float";
        } else if (node.contains("Integers")) {
            return "repeated sint64";
        } else if (node.contains("Integer")) {
            return "sint64";
        } else if (node.contains("Booleans")) {
            return "repeated bool";
        } else if (node.contains("Boolean")) {
            return "bool";
        } else if (node.contains("Bytes")) {
            return "bytes";
        }

        return null;
    }
}