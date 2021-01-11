package by.bntu.fitr.poisit.lytkina.parser.xml.service.sax;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import static by.bntu.fitr.poisit.lytkina.parser.xml.service.XMLParser.logger;

public class CourcesXmlHandle extends DefaultHandler {
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        logger.info("Tag "+ qName);
        if (qName.equals("course")){
            logger.info("course id: {}", attributes.getValue("id"));
            logger.info("students: {}", attributes.getValue("students"));
        }
        if (qName.equals("name")){
            logger.info("name: {}", qName);
        }
        if (qName.equals("description")){
            logger.info("description: {}", attributes.getValue("description"));
        }
        super.startElement(uri, localName, qName, attributes);
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);
    }
}
