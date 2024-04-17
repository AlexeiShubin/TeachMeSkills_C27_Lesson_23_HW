package SAXfabric;

import model.Sonnet;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.Objects;

public class SAXparser {
    public static Sonnet parse(String path) {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        Handler handler = new Handler();
        SAXParser parser = null;
        try {
            parser = factory.newSAXParser();
        } catch (Exception ignored) {
        }

        File file = new File(path);

        try {
            Objects.requireNonNull(parser).parse(file, handler);
        } catch (Exception ignored) {
        }


        return handler.getSonnet();
    }
}
