package com.jay.domain;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;


public class FIndByIdResponse {
	
	@Autowired
	private Collection<Entry> entry;
	private Status status;
	public FIndByIdResponse(Collection<Entry> entry, Status status) {
		
		this.entry = entry;
		this.status = status;
	}
	public Collection<Entry> getEntry() {
		return entry;
	}
	public Status getStatus() {
		return status;
	}
	

}
