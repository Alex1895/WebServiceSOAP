package com.hcl.soap.client;

import com.hcl.publisher.ListEmployeeApp;
import com.hcl.service.EmployeemanagerService;

public class employee_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeemanagerService service = new EmployeemanagerService();
		Employeemanager port = service.getEmployeemanagerPort();
		System.out.println(port.getEmploye());
	}

}

