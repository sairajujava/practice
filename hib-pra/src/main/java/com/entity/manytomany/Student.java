package com.entity.manytomany;

import java.io.Serializable;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_student")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "s_id")
	private long id;
	@Column(name = "s_name")
	private String name;
	@Column(name = "s_mobile")
	private String mobile;
	@Column(name = "s_dob")
	private Date dob;
	
	
	@ManyToMany(cascade = CascadeType.ALL)
	
	@JoinTable(
				name = "student_course",
				joinColumns = {
						@JoinColumn(name="s_id")
				},
				inverseJoinColumns = {
						@JoinColumn(name = "c_id")
				})
	private Set<Course> cset = new HashSet<Course>();
	

	public Student() {

	}

	public Student(String name, String mobile, Date dob) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.dob = dob;
	}
	
	

	public Set<Course> getCset() {
		return cset;
	}

	public void setCset(Set<Course> cset) {
		this.cset = cset;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

}
