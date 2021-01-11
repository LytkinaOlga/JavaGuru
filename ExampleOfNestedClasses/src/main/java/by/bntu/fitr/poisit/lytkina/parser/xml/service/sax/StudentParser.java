package by.bntu.fitr.poisit.lytkina.parser.xml.service.sax;

import by.bntu.fitr.poisit.lytkina.parser.xml.service.sax.CourcesXmlHandle;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

public class StudentParser {
    public void run() throws ParserConfigurationException, SAXException, IOException {
        File file = new File("src/main/resources/courses.xml");
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        parser.parse(file, new CourcesXmlHandle());
    }
}
