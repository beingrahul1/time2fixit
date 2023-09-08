package com.stackroute.RegistrationService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.RegistrationService.model.ServiceCenter;


@Repository
public interface ServiceCenterRepository extends MongoRepository<ServiceCenter, String>{

	public ServiceCenter findByemail(String email);

}

