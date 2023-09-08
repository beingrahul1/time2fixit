package com.stackroute.RegistrationService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class User {

	@Id
	private String email;
	private String username;
	private String password;
	@Transient
	private String confirmPassword;
	private String phoneNumber;
	private String securityQuestion;
	private String securityAnswer;
	private String role="user";
}

