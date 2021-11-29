package com.dto;


import lombok.Data;

@Data
@lombok.Setter
@lombok.Getter
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.ToString
public class LoginDto {

	private String usernameOrEmail;
	private String password;

}
