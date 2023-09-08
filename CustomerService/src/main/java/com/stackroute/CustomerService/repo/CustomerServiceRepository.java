package com.stackroute.CustomerService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.stackroute.CustomerService.Model.*;

@Repository
public interface CustomerServiceRepository extends MongoRepository<Customer,String>{
		
	public Customer findByEmail(String email);
	//public boolean deleteCustomer(String email);
}
