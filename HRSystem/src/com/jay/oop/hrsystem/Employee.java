package com.jay.oop.hrsystem;

public class Employee{
	private int empId;
	private String empFirstName, empLastName;
	private Phone phone ;
	private Address address; 
	private Role role;
	
	public Employee(int empId, String empFirstName, String empLastName) {
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
	}
	
	public Employee() {
		
	}

	
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	


	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", phone=" + phone + ", address=" + address + ", role=" + role + "]";
	}


	
	
	
	

}
