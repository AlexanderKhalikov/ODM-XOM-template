package org.odm;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        jaxbObjectToXML(new Request(Arrays.asList(
                new Client("John", 25, 25000, true),
                new Client("Aleks", 26, 30000, false),
                new Client()
        )));
        jaxbObjectToXML(new Response());
    }

    private static void jaxbObjectToXML(Object object) {
        String xmlString;
        try {
            JAXBContext context = JAXBContext.newInstance(object.getClass());
            Marshaller marshaller = context.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            StringWriter sw = new StringWriter();
            marshaller.marshal(object, sw);
            xmlString = sw.toString();
            System.out.println(xmlString);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
