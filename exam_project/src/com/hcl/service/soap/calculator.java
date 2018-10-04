package com.hcl.service.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public class calculator {
	@WebMethod
	public @WebResult(name="sum") int sum(@WebParam(name="n1")int n1,@WebParam(name="n2") int n2){
	 return n1+n2;
}	@WebMethod
	public @WebResult(name="res") int res(@WebParam(name="n1")int n1,@WebParam(name="n2") int n2){
		 return n1-n2;
	}
	public @WebResult(name="mul") int mul(@WebParam(name="n1")int n1,@WebParam(name="n2") int n2){
		 return n1*n2;
	}
	public @WebResult(name="div") int div(@WebParam(name="n1")int n1,@WebParam(name="n2") int n2){
		 return n1/n2;
	}
	//public @WebResult(name="factorial") int fact(@WebParam(name="n1")int n1,@WebParam(name="n2") int n2){
	//	return  null;
//	}
	public @WebResult(name="fibo") int fibo(@WebParam(name="n1")int n1,@WebParam(name="n2") int n2, @WebParam(name="aux")int aux){
		int exc = 1000;
		n1 = 1;
		n2 = 2; 
		System.out.println(n1);
		System.out.println(n2);
		while (n1 + n2 <= exc) {
			aux = n1;
			n1 = n2;
			n2 = aux + n1;
			System.out.println(n2);
		}
		return n2;
	}
	
}
