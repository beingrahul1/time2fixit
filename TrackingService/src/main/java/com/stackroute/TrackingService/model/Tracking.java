package com.stackroute.TrackingService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Tracking {
	private String userEmail;
	private String serviceProviderEmail;
	private String status;
	@Id
	private int bookingId;
	private String deviceType;
	private String deviceName;
	private int modelNo;
	private String issueType;
	private String issueDescription;
	private String expectedTime;
	private String costDate;
	

}
