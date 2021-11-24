package com.vo;

import java.sql.Date;

import lombok.Data;

@Data
@lombok.Setter
@lombok.Getter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
public class EmployeeVO {

	private Long id;
	private String name;
	private String salary;
	private String address;
	private Date dob;
	private Date doj;

}
