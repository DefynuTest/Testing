package com.defynu.Model;

public class User {
	private String email;
	private String password;
	private String firstname;
	private String lastname;
	private Long phoneNumber;
	
	
	public User(String email , String password,  Long phoneNumber)
	{
		this.email = email;
		this.password= password;
		this.phoneNumber = phoneNumber;
	}
	
	public User(String email , String password,String firstname, String lastname)
	{
		this.email = email;
		this.password= password;
		this.firstname = firstname;
		this.lastname= lastname;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


}

