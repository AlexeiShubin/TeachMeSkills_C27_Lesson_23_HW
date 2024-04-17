package XMLfabric;

import org.w3c.dom.Document;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class DOMparser {
    public static Document openFile(String path) throws Exception {
        return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(new File(path));
    }
}
