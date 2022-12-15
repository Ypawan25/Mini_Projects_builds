package com.modal;

public class Accountant {
	
	private String username;
	private String password;
	
	public Accountant() {
		// TODO Auto-generated constructor stub
	}

	public Accountant(String username, String password) {
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

	@Override
	public String toString() {
		return "Accountant [username=" + username + "]";
	}
	
	

}
