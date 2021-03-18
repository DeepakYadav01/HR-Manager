package com.java.advancejava.webservices.assignment.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HR {
	
	@Id
	private String username;
	private String password;
	
	
	public HR() {
		super();
	}


	public HR(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
