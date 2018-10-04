package com.hcl.service.publisher;

import javax.xml.ws.Endpoint;

import com.hcl.service.soap.calculator;

public class calculatorapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "http://localhost:8039/calculator";
		calculator service =  new calculator();
		Endpoint.publish(url,service);
		System.out.println("running");
	}

}
