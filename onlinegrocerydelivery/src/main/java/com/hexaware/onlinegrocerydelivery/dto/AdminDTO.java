package com.hexaware.onlinegrocerydelivery.dto;

public class AdminDTO {
	private int admin_id;
	private String username;
	private String password;

	
	public AdminDTO() {
		super();
	}


	public AdminDTO(int admin_id, String username, String password) {
		super();
		this.admin_id = admin_id;
		this.username = username;
		this.password = password;
	}


	public int getAdmin_id() {
		return admin_id;
	}


	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
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
		return "AdminDTO [admin_id=" + admin_id + ", username=" + username + ", password=" + password + "]";
	}

}