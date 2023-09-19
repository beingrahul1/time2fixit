package com.stackroute.ServiceProviderService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ServiceCenter {
	private String email;
	private String shopName;
	private String password;
	private String confirmPassword;
	private String phoneNumber;
	private String serviceType;
	private String shopOwnerName;
	private String shopAddress;
	private String securityQuestion;
	private String securityAnswer;
	private String role="servicecenter";

}

