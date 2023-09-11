package com.stackroute.ReviewService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class UserFeedback {
	
	@Id
    private int id;
    private String email;
    private String feedback;
    private int rating;
    
}


