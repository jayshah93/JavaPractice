package com.jay.oop.hrsystem;

import java.time.LocalDateTime;

public class FullTime extends Employee {
	private LocalDateTime start;
	private float baseSalaryPerYear, bonusPerYear;
	
	public FullTime(int empId, String empFirstName, String empLastName, LocalDateTime start, float baseSalaryPerYear,
			float bonusPerYear) {
		super(empId, empFirstName, empLastName);
		this.start = start;
		this.baseSalaryPerYear = baseSalaryPerYear;
		this.bonusPerYear = bonusPerYear;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public void setBaseSalaryPerYear(float baseSalaryPerYear) {
		this.baseSalaryPerYear = baseSalaryPerYear;
	}

	public void setBonusPerYear(float bonusPerYear) {
		this.bonusPerYear = bonusPerYear;
	}

	@Override
	public String toString() {
		return "FullTime [start=" + start + ", baseSalaryPerYear=" + baseSalaryPerYear + ", bonusPerYear="
				+ bonusPerYear + "]";
	}
	
	
	
}
