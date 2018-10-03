package com.hcl.soap.service;
import javax.jws.WebService;
import javax.jws.WebMethod;
@WebService
public class Calculator {
  @WebMethod
  public int sum(int n1, int n2){
    return n1+n2;
  }
  @WebMethod
  public int res(int n1, int n2){
    return n1-n2;
  }
  @WebMethod
  public int mul(int n1, int n2){
    return n1*n2;
  }
  @WebMethod
  public int div(int n1, int n2){
    return n1/n2;
  }
}
