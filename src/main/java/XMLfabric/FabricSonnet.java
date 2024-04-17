package XMLfabric;

import consts.Consts;
import model.Author;
import model.Sonnet;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import java.util.List;

import static org.w3c.dom.Node.ELEMENT_NODE;

public class FabricSonnet {
    public static Sonnet fabricSonnetFromXML(String pathToXML) {
        Document doc;
        try {
            doc = DOMparser.openFile(pathToXML);
        } catch (Exception e) {
            System.out.println("Ошибка");
            return null;
        }

        Node sonnetTag = doc.getFirstChild();
        NodeList sonnetChildren = sonnetTag.getChildNodes();
        Node authorNode = null;
        Node linesNode = null;
        String title = null;
        for (int i = 0; i < sonnetChildren.getLength(); i++) {
            if (sonnetChildren.item(i).getNodeType() != ELEMENT_NODE) continue;

            switch (sonnetChildren.item(i).getNodeName()) {

                case Consts.TAG_NAME_AUTHOR: {
                    authorNode = sonnetChildren.item(i);
                    break;
                }
                case Consts.TAG_NAME_TITLE: {
                    title = sonnetChildren.item(i).getTextContent();
                    break;
                }
                case Consts.TAG_NAME_LINES: {
                    linesNode = sonnetChildren.item(i);
                    break;
                }

            }

        }

        if (authorNode == null || linesNode == null) return null;

        Author author = FabricAuthor.fabricAuthor(authorNode.getChildNodes());
        List<String> lines = FabricLInes.fabricLines(linesNode.getChildNodes());
        return new Sonnet(author, title, lines);

    }
}
