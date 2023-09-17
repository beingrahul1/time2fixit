package com.stackroute.ServiceProviderService.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "providers")
@JsonIgnoreProperties(ignoreUnknown = true)
public class Provider {
	
	
	
    @Id
    private String email;
    private String shopname;
    private String shopownername;
    private String password;
    private String address;
    private  String contactnumber;
    private String profilePic;
    private List<String> serviceProduct;
    private List<String> productBrand;
}
