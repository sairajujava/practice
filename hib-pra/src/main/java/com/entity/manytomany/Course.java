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
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_course")
public class Course implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "c_id")
	private long id;
	@Column(name = "c_name")
	private String coursename;
	@Column(name = "c_doj")
	private Date cdoj;
	@Column(name = "c_duration")
	private String duration;

	@ManyToMany(cascade = CascadeType.ALL, mappedBy = "cset")
	private Set<Student> sset = new HashSet<Student>();

	public Course() {

	}

	public Course(String coursename, Date cdoj, String duration) {
		super();
		this.coursename = coursename;
		this.cdoj = cdoj;
		this.duration = duration;
	}

	public Set<Student> getSset() {
		return sset;
	}

	public void setSset(Set<Student> sset) {
		this.sset = sset;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	public Date getCdoj() {
		return cdoj;
	}

	public void setCdoj(Date cdoj) {
		this.cdoj = cdoj;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

}
