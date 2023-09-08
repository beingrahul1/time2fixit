package com.stackroute.CustomerService.Controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
//import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.CustomerService.Model.Customer;
import com.stackroute.CustomerService.repo.CustomerServiceRepository;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	CustomerServiceRepository customerServiceRepository;
	
	Customer c1;
	
	
//	@PostMapping
	@RabbitListener(queues = "cgiqueue2")
	public void getCustomer(Customer c2)
	{
		
		this.c1 = c2;
		customerServiceRepository.save(c1);
		
	}
	
	
	
	@PostMapping("update")
	public ResponseEntity<?> updateCustomer(@RequestBody Customer c1 )
	{
		Customer c2 = customerServiceRepository.findByEmail(c1.getEmail());
		Customer c3 = c2;
		c3.setAddress(c1.getAddress());
		c3.setPhoneNumber(c1.getPhoneNumber());
		c3.setGender(c1.getGender());
		c3.setName(c1.getName());
		c3.setUsername(c1.getUsername());
		c3.setPassword(c1.getPassword());
		customerServiceRepository.delete(c2);
		customerServiceRepository.save(c3);
		
		return new ResponseEntity<Customer>(c3, HttpStatus.OK);
		
	}
	//delete
	@DeleteMapping("delete")	
	public ResponseEntity<?> deletebyemail(@RequestBody Customer c1)
	{
		
		Customer c2 = customerServiceRepository.findByEmail(c1.getEmail());
		if(c2 == null)
		{
			return new ResponseEntity<String>("Customer Not Exist", HttpStatus.OK);
		}
		else {
			customerServiceRepository.delete(c2);
//			customerServiceRepository.save(c3);
			
			return new ResponseEntity<String>("Customer Deleted", HttpStatus.OK);
			
		}
		
//		Customer c3 =c2;
		
				
		
	}
//	@GetMapping("getCustomer/{email}")
//	public ResponseEntity<?> fetchCustomer(String email){
//		List<Customer> customer = this.customerServiceRepository.findByemail
//	}
	
}

