package test.data.mockupservice.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
/**
 * This class was generated by Apache CXF 2.3.6
 * 2016-02-18T23:36:32.490+05:30
 * Generated source version: 2.3.6
 *
 */
@WebService(targetNamespace = "http://apache.org/hello_world_soap_http", name = "Greeter")
public interface Greeter {


	@WebMethod
	@RequestWrapper(localName = "greetMe", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "org.apache.helloWorldSoapHttp.types.GreetMeDocument")
	@ResponseWrapper(localName = "greetMeResponse", targetNamespace = "http://apache.org/hello_world_soap_http/types", className = "org.apache.helloWorldSoapHttp.types.GreetMeResponseDocument")
	@WebResult(name = "responseType", targetNamespace = "http://apache.org/hello_world_soap_http/types")
	public String greetMe(
			@WebParam(name = "requestType", targetNamespace = "http://apache.org/hello_world_soap_http/types")
					String requestType
	);
}

