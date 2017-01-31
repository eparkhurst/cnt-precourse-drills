package com.galvanize;

import java.util.ArrayList;

public class Business implements Addressable{
	
	private final String name;
	
	private final ArrayList<Address> addresses;
	
	public Business(String newName){
		name = newName;
		addresses = null;
	}

	public ArrayList<Address> getAddresses() {
		return addresses;
	}

	public void addAddress(Address newAddress) {
		addresses.add(newAddress);
	}

	public String getName() {
		return name;
	}
}
