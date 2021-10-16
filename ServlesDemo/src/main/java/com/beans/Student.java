package com.beans;

import java.sql.Date;

public class Student {

	private Long id;
	private String username;
	private String email;
	private Date dob;
	private String mobile;
	private String course;
	
	public Student() {
		
	}

	public Student(Long id, String username, String email, Date dob,String course,String mobile) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.dob = dob;
		this.course = course;
		this.mobile = mobile;
	}

	public Student(String username, String email, Date dob, String mobile, String course) {
		super();
		this.username = username;
		this.email = email;
		this.dob = dob;
		this.mobile = mobile;
		this.course = course;
	}

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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [username=" + username + ", email=" + email + ", dob=" + dob + ", mobile=" + mobile
				+ ", course=" + course + "]";
	}

}
