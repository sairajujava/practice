package com.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@lombok.Setter
@lombok.Getter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
public class SignupDto {

	private String name;
	@NotEmpty
	@Size(min = 2, message = "user name should have at least 2 characters")
	private String username;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	@Size(min = 8, message = "password should have at least 8 characters")
	private String password;

}
