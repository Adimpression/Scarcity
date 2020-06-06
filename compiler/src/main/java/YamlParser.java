import org.yaml.snakeyaml.DumperOptions;
import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YamlParser {

    private static String[] handleBasicState(final String dimensions) {
        final int tail = dimensions.lastIndexOf('/');
        final String statePre;
        if (tail != -1) {
            statePre = dimensions.substring(tail + 1);
        } else {
            statePre = dimensions;
        }
        final String state = "Is " + statePre.trim();
        System.out.println(state);
        final String stateLower = statePre.replaceAll(" ",
                "")
                .toLowerCase();

        final String[] split = dimensions.replaceAll(" ",
                "")
                .split("/");

        final String[] splitLower = new String[split.length];

        for (int i = 0; i < split.length; i++) {
            final String key = split[i];
            splitLower[i] = key.toLowerCase();
        }
        final String dimension = String.join(".",
                splitLower) + "." + stateLower;

        return new String[]{dimension, state};

    }

    public static Map<String, InputStream> parse(final String fullFileName) throws IOException {
        final HashMap<String, InputStream> returnVa = new HashMap<>();

        try (final InputStream inputStream = new FileInputStream(new File(fullFileName))) {
            Yaml yaml = new Yaml();
            final Map<String, Object> states = yaml.load(inputStream);
            for (final Map.Entry<String, Object> kv : states.entrySet()) {
                final Object value = kv.getValue();
                final String[] basicState = handleBasicState(kv.getKey());

                if (value != null) {
                    if (value instanceof Map) {
                        final String[][] inOut = handleFullState(kv.getKey(),
                                (Map<String, Object>) value);

                        for (final String[] fileAndContent : inOut) {
                            if (fileAndContent != null) {
                                returnVa.put(fileAndContent[0],
                                        new ByteArrayInputStream(fileAndContent[1].getBytes()));
                            }
                        }

                        final ArrayList<String> effectiveParams = new ArrayList<>();

                        for (final String[] row : inOut) {
                            if (row != null) {
                                effectiveParams.add(row[0] + " / " + row[2]);
                            }
                        }

                        final String content = getYaml(effectiveParams,
                                basicState[1]);

                        returnVa.put(basicState[0],
                                new ByteArrayInputStream(content.getBytes()));

                    }
                } else {
                    returnVa.put(basicState[0],
                            new ByteArrayInputStream(basicState[1].getBytes()));
                }
            }

        }
        return returnVa;
    }

    private static String[][] handleFullState(final String key, final Map<String, Object> value) {

        final String[] parentRaw = handleBasicState(key);
        final String parentProcessed = parentRaw[0].substring(0,
                parentRaw[0].lastIndexOf('.') + 1);

        String[] in = null;
        if (value.containsKey("In")) {
            in = new String[3];
            final List<String> effectiveParams = getEffectiveParams((List<String>) value.get("In"));
            final String file = parentProcessed + "input";
            final String state = "Is Input";
            final String content = getYaml(effectiveParams,
                    state);
            in[0] = file;
            in[1] = content;
            in[2] = state;

        }

        String[] out = null;
        if (value.containsKey("Out")) {
            out = new String[3];
            final List<String> effectiveParams = getEffectiveParams((List<String>) value.get("Out"));
            final String file = parentProcessed + "output";
            final String state = "Is Output";
            final String content = getYaml(effectiveParams,
                    state);
            out[0] = file;
            out[1] = content;
            out[2] = state;
        }

        return new String[][]{in, out};

    }

    private static String getYaml(final List<String> effectiveParamsIn, final String parent) {
        if (effectiveParamsIn.size() > 0) {
            final Map<String, List<String>> data = new HashMap<>();
            data.put(parent,
                    effectiveParamsIn);
            final DumperOptions options = new DumperOptions();
            options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            final Yaml yaml = new Yaml(options);
            final StringWriter stringWriter = new StringWriter();
            yaml.dump(data,
                    stringWriter);
            return stringWriter.toString();
        } else {
            final List<String> data = new ArrayList<>();
            data.add(parent);
            final DumperOptions options = new DumperOptions();
            options.setDefaultFlowStyle(DumperOptions.FlowStyle.BLOCK);
            final Yaml yaml = new Yaml(options);
            final StringWriter stringWriter = new StringWriter();
            yaml.dump(data,
                    stringWriter);
            return stringWriter.toString();
        }
    }

    private static List<String> getEffectiveParams(final List<String> params) {
        if (params == null) {
            return new ArrayList<>();
        }
        final List<String> effectiveParams = new ArrayList<>(params.size());
        for (final String node : params) {
            final String effectiveParam;
            if (isInternalDependency(node)) {
                effectiveParam = "Is " + node.trim();
            } else {
                final String[] handleBasicState = handleBasicState(node);
                effectiveParam = handleBasicState[0] + " / " + handleBasicState[1];
            }
            effectiveParams.add(effectiveParam);
        }
        return effectiveParams;
    }

    private static boolean isInternalDependency(final String node) {
        return node.contains("Strings") || node.contains("String") || node.contains("Floats") || node.contains("Float") || node.contains("Integers") || node.contains("Integer") || node.contains("Booleans") || node.contains("Boolean") || node.contains("Bytes");
    }
}
