package com.beans;

import java.sql.Date;

public class UserBean {

	private String username;
	private String password;
	private String email;
	private Date dob;
	private String mobile;
	private String city;
	private String state;
	private String country;
	
	public UserBean() {
		
	}

	public UserBean(String username, String password, String email, Date dob, String mobile, String city,
			String state, String country) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.dob = dob;
		this.mobile = mobile;
		this.city = city;
		this.state = state;
		this.country = country;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "UserBean [username=" + username + ", password=" + password + ", email=" + email
				+ ", dob=" + dob + ", mobile=" + mobile + ", city=" + city + ", state=" + state + ", country=" + country
				+ "]";
	}

}
