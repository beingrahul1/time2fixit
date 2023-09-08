	package com.stackroute.CustomerService.Model;

//import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Customer {
	
 @Id
 String email;
 String name;
 String username;
 String password;
 String address;
 String gender;
 String phoneNumber;
 
 
 
 
}
