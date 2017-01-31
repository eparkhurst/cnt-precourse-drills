package com.galvanize;

public class Address {
	
	private String street;
	private String city;
	private String state;
	private String zip;

	public Address(String inputStreet, String inputCity, String inputState, String inputZip){
		street = inputStreet;
		city = inputCity;
		state = inputState;
		zip = inputZip;
	}

	public String toString(){
		return street + ", " + city + ", " + state + " " + zip;
	}

	//Getters
	public String getStreet(){
		return street;
	}
	public String getCity(){
		return city;
	}
	public String getState(){
		return state;
	}
	public String getZip(){
		return zip;
	}
	//Setters
	public void setStreet(String newStreet){
		street = newStreet;
	}
	public void setCity(String newCity){
		city = newCity;
	}
	public void setState(String newState){
		state = newState;
	}
	public void setZip(String newZip){
		zip = newZip;
	}
}
