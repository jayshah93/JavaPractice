package com.jay.domain;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public class CustomerFindByNameRequest {
@Valid
@NotNull(message = "name can not be empty")	
private String name;

public CustomerFindByNameRequest(String name) {
	this.name = name;
	}

public String getName() {
	return name;
}

public CustomerFindByNameRequest() {
	
	}

}
