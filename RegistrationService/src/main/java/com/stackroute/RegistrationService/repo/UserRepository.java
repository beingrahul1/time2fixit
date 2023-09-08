package com.stackroute.RegistrationService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.RegistrationService.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	public User findByemail(String email);
}

