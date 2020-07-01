package com.jay.oop.hrsystem;

import java.util.List;

public class Company {
	private int companyId;
	private String companyName;
	List <Employee> employee;
	public Company(int companyId, String companyName, List<Employee> employee) {
		this.companyId = companyId;
		this.companyName = companyName;
		this.employee = employee;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", companyName=" + companyName + ", employee=" + employee + "]";
	}
	

}
