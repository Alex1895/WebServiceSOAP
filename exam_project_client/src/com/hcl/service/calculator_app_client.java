package com.hcl.service;

import com.hcl.service.soap.Calculator;
import com.hcl.service.soap.CalculatorService;
import com.hcl.service.soap.calculator;

public class calculator_app_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorService service = new CalculatorService();
		Calculator port = service.getCalculatorPort();
		System.out.println(port.fibo(1,2,6));
		
	}

}
