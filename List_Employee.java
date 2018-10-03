package com.hcl.publisher;

import javax.xml.ws.Endpoint;

import com.hcl.service.employeemanager;

public class ListEmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url ="http://localhost:8040/estacosa";
		employeemanager manager = new employeemanager();
		Endpoint.publish(url, manager);
		System.out.println("Running");
	}

}
