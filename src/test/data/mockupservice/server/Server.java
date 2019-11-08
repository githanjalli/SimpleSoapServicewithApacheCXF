package test.data.mockupservice.server;

import javax.xml.ws.Endpoint;

public class Server {

    public Server() throws Exception {
        System.out.println("Starting Server");

        GreeterImpl implementor = new GreeterImpl();
        String address = "http://localhost:9001/helloworld?wsdl";
        Endpoint.publish(address, implementor);
    }


    public static void StartWebservice() throws Exception {
        new Server();
        System.out.println("Server ready...");
    }
}