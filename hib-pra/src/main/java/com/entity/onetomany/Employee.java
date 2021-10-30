package com.entity.onetomany;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_employee")
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "e_id")
	private Long eid;
	@Column(name = "e_name")
	private String ename;
	@Column(name = "e_sal")
	private String esal;
	@Column(name = "e_doj")
	private Date doj;
	@Column(name = "e_dob")
	private Date dob;
	
	@ManyToOne(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
	@JoinColumn(name = "d_id")
	private Department dept;

	public Employee() {

	}
	
	

	public Department getDept() {
		return dept;
	}



	public void setDept(Department dept) {
		this.dept = dept;
	}



	public Employee(String ename, String esal, Date doj, Date dob) {
		super();
		this.ename = ename;
		this.esal = esal;
		this.doj = doj;
		this.dob = dob;
	}

	public Long getEid() {
		return eid;
	}

	public void setEid(Long eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEsal() {
		return esal;
	}

	public void setEsal(String esal) {
		this.esal = esal;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
