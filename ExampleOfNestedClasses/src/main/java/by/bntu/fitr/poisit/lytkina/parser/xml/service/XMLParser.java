package by.bntu.fitr.poisit.lytkina.parser.xml.service;

import by.bntu.fitr.poisit.lytkina.parser.xml.service.sax.StudentParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class XMLParser {
    public static Logger logger = LoggerFactory.getLogger(XMLParser.class);
    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        StudentParser studentParser = new StudentParser();
        studentParser.run();
    }
}
