package com.hcl.dto;

public class Address {
	private String streetName;
	private int streetNumber;

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(int streetNumber) {
		this.streetNumber = streetNumber;
	}
	public Address(String streetName, int streetNumber){
		super();
		this.streetName=streetName;
		this.streetNumber=streetNumber;
	}
	public Address(){
		
	}
}
