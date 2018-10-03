package com.hcl.soap.service;
import javax.xml.ws.Endpoint;
import javax.jws.WebService;
@WebService
public class Calculator_App {
@WebEndpoint
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://localhost:8039/Calculator";
		Endpoint.publish("http://localhost:8039/Calculator", new Calculator());
		//System.out.println();
	}
}
