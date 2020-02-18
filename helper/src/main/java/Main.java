import com.google.protobuf.DescriptorProtos;

import java.io.*;
import java.util.List;

final public class Main {

  public static void main(String[] args) throws IOException {

    try {

      final StringBuffer badTsv = new StringBuffer();//TODO: FIXME
      final StringBuffer badCsv = new StringBuffer();//TODO: FIXME
      final StringBuffer badJson = new StringBuffer();//TODO: FIXME

     badJson.append(
              "<!DOCTYPE html>\n" +
                      "<html lang=\"en\">\n" +
                      "<head>\n" +
                      "    <meta charset=\"UTF-8\">\n" +
                      "    <title>State</title>\n" +
                      "    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/cytoscape/3.9.4/cytoscape.umd.js\"></script>\n" +
                      "</head>\n" +
                      "<body>\n" +
                      "<div id=\"cy\" style=\"position:fixed; position:absolute; top:0; right:0; bottom:0; left:0;\"></div>\n" +
                      "<script>\n" +
                      "    var config = {\n" +
                      "        container: document.getElementById('cy'),\n" +
                      "        elements:"
      );
      badJson.append("[");

      for (final DescriptorProtos.FileDescriptorProto fileDescriptorProto : DescriptorProtos.FileDescriptorSet.parser().parseFrom(new FileInputStream(args[0])).getFileList()) {

        final List<DescriptorProtos.DescriptorProto> messageTypeList = fileDescriptorProto.getMessageTypeList();

        for (final DescriptorProtos.DescriptorProto descriptorProto : messageTypeList) {

          for (final DescriptorProtos.FieldDescriptorProto fieldDescriptorProto : descriptorProto.getFieldList()) {

            final String name = fieldDescriptorProto.getName();

            if (name.equals("is") || name.equals("not")) {

//              continue;

            }

            final String descriptorProtoName = descriptorProto.getName();

            if (descriptorProtoName.startsWith("Not")) {

//              continue;

            }

            final String typeName = fieldDescriptorProto.getTypeName();


            final String source = ("." + fileDescriptorProto.getPackage() + "." + descriptorProtoName).replaceAll("\\.", "\\\\n").replaceAll("_", "\\\\n");
            final String destination = (typeName == null || typeName.isEmpty() ? "." + fileDescriptorProto.getPackage() + "." + fieldDescriptorProto.getName() : typeName).replaceAll("\\.", "\\\\n").replaceAll("_", "\\\\n");
            final String edge = source + "." + destination;

            badCsv.append(source).append(",").append(destination).append("\n");

            badTsv.append(source).append("\t").append(destination).append("\n");

            badJson
                    .append("{" + "\"data\": {\"id\": ").append("\"").append(source).append("\"").append("}" + "}").append(",")
                    .append("{" + "\"data\": {\"id\": ").append("\"").append(destination).append("\"").append("}" + "}").append(",")
                    .append("{" + "\"data\": {")
                    .append("\"id\": ").append("\"").append(edge).append("\"").append(",")
                    .append("\"source\": ").append("\"").append(destination).append("\"").append(",")
                    .append("\"target\": ").append("\"").append(source).append("\"")
                    .append("}" + "}")
                    .append(",")
                    .append("\n");
          }

        }

      }

      badJson.append("]");

      badJson.append(
              "        ,\n" +
                      "        layout: {\n" +
                      "            name: 'cose',\n" +
                      "            fit: true,\n" +
                      "            nodeDimensionsIncludeLabels: true,\n" +
                      "            componentSpacing: 150,\n" +
                      "            nodeRepulsion: function (node) {\n" +
                      "                return 204800;\n" +
                      "            },\n" +
                      "        },\n" +
                      "        style: cytoscape.stylesheet()\n" +
                      "            .selector('node')\n" +
                      "            .css({\n" +
                      "                'background-opacity': '0.5',\n" +
                      "                'background-color': 'orange',\n" +
                      "                'label': 'data(id)',\n" +
                      "                'text-wrap': 'wrap',\n" +
                      "            })\n" +
                      "            .selector('edge')\n" +
                      "            .css({\n" +
                      "                'curve-style': 'unbundled-bezier',\n" +
                      "                'width': '2px',\n" +
                      "                'background-opacity': '0.0',\n" +
                      "                'line-color': '#fbf5f5',\n" +
                      "                'arrow-color': '#f3eded',\n" +
                      "                'source-arrow-shape': 'vee',\n" +
                      "            })\n" +
                      "            .selector('label')\n" +
                      "            .css({\n" +
                      "                'text-halign': 'right',\n" +
                      "                'text-valign': 'center',\n" +
                      "                'text-max-width': '60px',\n" +
                      "                'font-size': 12,\n" +
                      "                'text-overflow-wrap': 'whitespace',\n" +
                      "            })\n" +
                      "\n" +
                      "    };\n" +
                      "    cy = cytoscape(config);\n" +
                      "\n" +
                      "    cy.on('tap', 'node', function (e) {\n" +
                      "        const clickedNode = e.target;\n" +
                      "        clickedNode.style('opacity', '1');\n" +
                      "        clickedNode.incomers().style('opacity', '1');\n" +
                      "    });\n" +
                      "\n" +
                      "    cy.on('tap', function(event){\n" +
                      "        // target holds a reference to the originator\n" +
                      "        // of the event (core or element)\n" +
                      "        var evtTarget = event.target;\n" +
                      "\n" +
                      "        if( evtTarget === cy ){\n" +
                      "            console.log('tap on background');\n" +
                      "            cy.nodes().style('opacity', '0.1');\n" +
                      "\n" +
                      "            let value = prompt(\"Hightlight nodes containing...\");\n" +
                      "\n" +
                      "            cy.$('#' + value).select();\n" +
                      "\n" +
                      "            cy.filter(function(ele , i){\n" +
                      "                return ele.id().toUpperCase().includes(value.toUpperCase())\n" +
                      "            }).forEach(value1 => {\n" +
                      "                value1.style('opacity', '1');\n" +
                      "            });\n" +
                      "\n" +
                      "        } else {\n" +
                      "            console.log('tap on some element');\n" +
                      "        }\n" +
                      "    });\n" +
                      "\n" +
                      "</script>\n" +
                      "</body>\n" +
                      "</html>"
      );

      final File fileCsv = new File(args[1]);
      final File fileTsv = new File(args[2]);


      try (final FileWriter fileWriter = new FileWriter(fileCsv, true); final BufferedWriter out = new BufferedWriter(fileWriter);) {

        out.write(badCsv.toString());

      } catch (Throwable e) {

        throw e;

      }

      try (final FileWriter fileWriter = new FileWriter(fileTsv, true); final BufferedWriter out = new BufferedWriter(fileWriter);) {

        out.write(badTsv.toString());

      } catch (Throwable e) {

        throw e;

      }


      try (final FileWriter fileWriter = new FileWriter(fileCsv + ".html", true); final BufferedWriter out = new BufferedWriter(fileWriter);) {

        out.write(badJson.toString());

      } catch (Throwable e) {

        throw e;

      }


    } catch (Throwable e) {

      throw e;

    }
  }
}
