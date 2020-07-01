package com.jay.domain;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class FIndByIdRequest {
	@Valid
	@NotNull(message="Id cannot be empty")
	private int id;

	public FIndByIdRequest(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}
}
