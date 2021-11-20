package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Builder;
import lombok.Data;

@Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Setter
@lombok.Getter
@lombok.ToString
@Builder
@Entity
@Table(name = "tbl_student")
public class Student {

	@Id
	@Column(name = "s_id")
	@SequenceGenerator(
			
			 name = "student_sequence",
			 sequenceName = "student_sequence",
			 allocationSize = 1
			
			)
	@GeneratedValue(
				strategy = GenerationType.SEQUENCE,
				generator = "student_sequence"
			
			)
	
	private Long id;
	@Column(name = "s_name")
	private String name;
	@Column(name = "s_dob")
	private Date dob;
	@Column(name = "s_course")
	private String course;
	@Column(name = "s_mobile")
	private String mobile;
	@Column(name = "s_email",nullable = false)
	private String emailId;
	
	@Embedded
	private Address address;

}
