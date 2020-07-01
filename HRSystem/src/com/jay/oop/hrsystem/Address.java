package com.jay.oop.hrsystem;


public class Address {
	private int addressId;
	private String zip, country, state, city, line1, line2;
	public Address(int addressId, String zip, String country, String state, String city, String line1, String line2) {
		this.addressId = addressId;
		this.zip = zip;
		this.country = country;
		this.state = state;
		this.city = city;
		this.line1 = line1;
		this.line2 = line2;
	}
	
	public Address() {
		
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", zip=" + zip + ", country=" + country + ", state=" + state
				+ ", city=" + city + ", line1=" + line1 + ", line2=" + line2 + "]";
	}

	

}
