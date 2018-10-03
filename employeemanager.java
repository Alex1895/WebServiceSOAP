package com.hcl.service;
import java.util.*;

import javax.annotation.PostConstruct;
import javax.jws.WebMethod;
import javax.jws.WebService;

import com.hcl.dto.Address;
import com.hcl.dto.employee;

@WebService
public class employeemanager {
	private List<employee> listEmployee;
	@PostConstruct
	@WebMethod(exclude=true)
	public void init(){
		listEmployee = new ArrayList<>();
		employee emp1 = new employee(1,"abimael",25,new Address("chihuahua",25));
		employee emp2 = new employee(2,"rene",23,new Address("guadalajara",2));
		employee emp3 = new employee(3,"alejandro",22,new Address("tlaquepaque",50));
		listEmployee.add(emp1);
		listEmployee.add(emp2);
		listEmployee.add(emp3);
	}
	@WebMethod (exclude=true)
	public List<employee> getEmployees(){
		return listEmployee;
	}
	@WebMethod()
	public employee getEmploye(int id){
		//employee employes;
		for (employee emp: listEmployee){
			if (emp.getId()==id){
				return emp;
			}
		}
		return null;
	}
	@WebMethod()
	public String removeEmploye(int id){
		//employee employes;
		for (employee emp: listEmployee){
			if (emp.getId()==id){
				listEmployee.remove(emp); //elimina el dato 
				return "elemento eliminado";
			}
		}
		return "no encontro nada";
	}
	@WebMethod()
	public String addEmploye(int id , String name, int age){
		//employee employes;
		for (employee emp: listEmployee){
			if(listEmployee.size() > 0 && emp.getId()== id){ 
			
			if (emp.getId()==id){
				listEmployee.add(emp);
				return "elemento agregado satisfactoriamente";
			}
		}else {
			return "ya existe compa";
		}
	}
		return "no encontro nada";
	@WebMethod()
	public String addEmploye2(int id , String name, int age){
		Address a = new Address.getValue(); //obtener el valor del objeto address previamente usado
		//int id;
		for (employee emp: listEmployee){
			if(! listEmployee.isEmpty() || listEmployee.size() >= 0 ){ //si la lista esta vacia retorna null 
			return  null;
		}else { // de lo contrario agrega los siguientes valores 
			return emp.add(id,name,age,a);
		}
	}
		return "lista vacia ";

}
}
