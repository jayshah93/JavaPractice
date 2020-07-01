package com.jay.domain;

import java.util.Collection;

public class FindByNameResponse {
	private Collection<Entry> entryCollection;
	private Status status;
	public FindByNameResponse(Collection<Entry> entryCollection, Status status) {
	
		this.entryCollection = entryCollection;
		this.status = status;
	}
	public FindByNameResponse() {
	
	}
	public Collection<Entry> getEntryCollection() {
		return entryCollection;
	}
	public Status getStatus() {
		return status;
	}
	
	

}
