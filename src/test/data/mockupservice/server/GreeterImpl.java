package test.data.mockupservice.server;

import java.util.logging.Logger;

@javax.jws.WebService(name = "Soap", serviceName = "SOAPService",
        targetNamespace = "http://apache.org/hello_world_soap_http",
        wsdlLocation = "helloworld.wsdl")

public class GreeterImpl implements Greeter {

    private static final Logger LOG =
            Logger.getLogger(GreeterImpl.class.getPackage().getName());

    /* (non-Javadoc)
     * @see org.objectweb.hello_world_soap_http.Greeter#greetMe(java.lang.String)
     */
    public String greetMe(String me) {
        LOG.info("Executing operation greetMe");
        System.out.println("Executing operation greetMe");
        System.out.println("Message received: " + me + "\n");
        return "Hello " + me;
    }
}