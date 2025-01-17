package XML_Exercise;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
public class SaxParser extends DefaultHandler {
    public static void main(String args[])
    {
        try
        {
            SAXParserFactory fact=SAXParserFactory.newInstance();
            SAXParser parser=fact.newSAXParser();
            parser.parse(new File("D:\\Learning\\Programming\\Java MindBridge Training\\Day-14\\src\\XML_Exercise\\Account.xml"),new SaxParser());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
   @Override
   public void startDocument() throws SAXException {
       System.out.println("Start Document");
   }
    @Override
    public void endDocument() throws SAXException {
        System.out.println("End Document");
    }
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        System.out.println("Start ELement :"+qName);
    }
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        System.out.println("End Element :"+qName);
    }
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        System.out.println("Value :"+new String(ch,start,length));
    }
}
