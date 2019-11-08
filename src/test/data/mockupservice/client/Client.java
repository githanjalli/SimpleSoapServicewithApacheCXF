package test.data.mockupservice.client;

import java.io.File;
import java.net.URL;

import javax.xml.namespace.QName;

import test.data.mockupservice.server.Greeter;

public final class Client {

    private static final QName SERVICE_NAME
            = new QName("http://apache.org/hello_world_soap_http", "SOAPService");

    private static final QName PORT_NAME =
            new QName("http://apache.org/hello_world_soap_http", "SoapPort");


    private Client() {
    }

    public static void main(String[] args) throws Exception {

        URL wsdlURL = new URL("http://localhost:9001/helloworld?wsdl");

        System.out.println("WSDL : " + wsdlURL);
        SOAPService ss = new SOAPService(wsdlURL, SERVICE_NAME);
        Greeter port = ss.getPort(PORT_NAME, Greeter.class);

        System.out.println("Invoking greetMe...");
        try {
            String resp = port.greetMe(System.getProperty("user.name"));
            System.out.println("Server responded with: " + resp);
            System.out.println();

        } catch (Exception e) {
            System.out.println("Invocation failed with the following: " + e.getCause());
            System.out.println();
        }

        System.exit(0);
    }

}