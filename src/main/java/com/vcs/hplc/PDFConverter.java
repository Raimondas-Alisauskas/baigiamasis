package com.vcs.hplc;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.AutoDetectParser;
import org.apache.tika.sax.BodyContentHandler;
import org.xml.sax.SAXException;

import java.io.IOException;
import java.io.InputStream;

public class PDFConverter {


    public static void main(String ... wef) throws TikaException, SAXException, IOException {
        parseExample();
    }

    public static void parseExample() throws IOException, SAXException, TikaException {
        AutoDetectParser parser = new AutoDetectParser();
        BodyContentHandler handler = new BodyContentHandler();
        Metadata metadata = new Metadata();
        try (InputStream stream = PDFConverter.class.getResourceAsStream("/Result 16732_RS2.pdf")) {
            parser.parse(stream, handler, metadata);
            System.out.println( handler.toString());
        }
    }
}
