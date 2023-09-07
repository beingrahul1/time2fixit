package com.stackroute.ServiceProviderService.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(indexName = "serviceproviders")
public class ServiceProvider {
   private int id;
    private String shopname;
    private String shopownername;
    @Id
    private String email;
    private String password;
    private String confirmpassword;
    private String address;
    private String country;
    private  String contactnumber;
    private String serviceType;
}