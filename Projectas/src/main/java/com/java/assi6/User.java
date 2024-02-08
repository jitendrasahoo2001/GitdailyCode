package com.java.assi6;

public class User {
	private String username;
    private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", email=" + email + "]";
	}
	public User(String username, String email) {
		super();
		this.username = username;
		this.email = email;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    

}
