package com.jay.shop.service;

public class LoginService {
public boolean authenticate(String username, String password) {
	
	return username!=null&&username.trim().equalsIgnoreCase("java")&&password!=null
			&&password.equalsIgnoreCase("java");
}
}
