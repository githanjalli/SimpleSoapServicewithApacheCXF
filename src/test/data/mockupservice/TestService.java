package test.data.mockupservice;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;


import test.data.mockupservice.server.Server;



public class TestService {


	public static void main(String[] args) throws Exception {
		StartMyWebService();
		}
	

	private static void StartMyWebService() throws Exception {
		Server.StartWebservice();
	}

}
