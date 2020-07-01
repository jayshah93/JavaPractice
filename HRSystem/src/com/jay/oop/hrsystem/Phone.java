package com.jay.oop.hrsystem;

public class Phone {
	private int phoneId;
	private String areaCode, number, countryCode;
	
	public Phone(int phoneId, String areaCode, String number, String countryCode) {
		this.phoneId = phoneId;
		this.areaCode = areaCode;
		this.number = number;
		this.countryCode = countryCode;
	}
	
	public Phone() {
		
	}

	public void setPhoneId(int phoneId) {
		this.phoneId = phoneId;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "Phone [phoneId=" + phoneId + ", areaCode=" + areaCode + ", number=" + number + ", countryCode="
				+ countryCode + "]";
	}

	

}
