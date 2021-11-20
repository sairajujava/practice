package com.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "tbl_employee")
@Data
@lombok.Setter
@lombok.Getter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
@Builder
public class Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "e_id")
	private Long id;
	@Column(name = "e_name")
	private String name;
	@Column(name = "e_salary")
	private String salary;
	@Column(name = "e_address")
	private String address;
	@Column(name = "e_dob")
	private Date dob;
	@Column(name = "e_doj")
	private Date doj;

}
