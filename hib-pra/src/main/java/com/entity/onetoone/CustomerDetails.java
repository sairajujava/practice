package com.entity.onetoone;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_custdetails")
public class CustomerDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cd_id")
	private Long id;
	@Column(name = "cd_hobby")
	private String hobby;
	@Column(name = "cd_aadar")
	private String aadarNum;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "c_id")
	private Customer cust;
	
	public CustomerDetails() {
		
	}

	public CustomerDetails(String hobby, String aadarNum) {
		super();
		this.hobby = hobby;
		this.aadarNum = aadarNum;
	}

	public Customer getCust() {
		return cust;
	}

	public void setCust(Customer cust) {
		this.cust = cust;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getAadarNum() {
		return aadarNum;
	}

	public void setAadarNum(String aadarNum) {
		this.aadarNum = aadarNum;
	}

}
