package com.jay.oop.hrsystem;

import java.time.LocalDateTime;

public class Contractor extends Employee {
	private LocalDateTime start, end; 
	private float hourlyRate;
	
	public Contractor(int empId, String empFirstName, String empLastName, LocalDateTime start, LocalDateTime end,
			float hourlyRate) {
		super(empId, empFirstName, empLastName);
		this.start = start;
		this.end = end;
		this.hourlyRate = hourlyRate;
	}

	public void setStart(LocalDateTime start) {
		this.start = start;
	}

	public void setEnd(LocalDateTime end) {
		this.end = end;
	}

	public void setHourlyRate(float hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		return "Contractor [start=" + start + ", end=" + end + ", hourlyRate=" + hourlyRate + "]";
	}

	
	

}
