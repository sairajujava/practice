package com.entity.onetoone;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_customer")
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "c_id")
	private Long id;
	@Column(name = "c_name")
	private String name;
	@Column(name = "c_email")
	private String email;
	@Column(name = "c_mobile")
	private String mobile;

	@OneToOne(mappedBy = "cust",cascade = CascadeType.ALL , fetch = FetchType.LAZY)
	private CustomerDetails cdetails;
	
	public Customer() {
		
	}

	public Customer(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}

	public CustomerDetails getCdetails() {
		return cdetails;
	}

	public void setCdetails(CustomerDetails cdetails) {
		this.cdetails = cdetails;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

}
