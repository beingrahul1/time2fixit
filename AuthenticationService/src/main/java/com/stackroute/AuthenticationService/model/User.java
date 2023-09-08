package com.stackroute.AuthenticationService.model;

import javax.persistence.Entity;
import javax.persistence.Id;

//import org.springframework.data.annotation.Id;
//import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	String email;
	String password;
//	String role;
	
}

