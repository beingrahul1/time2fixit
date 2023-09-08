package com.stackroute.RegistrationService.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.RegistrationService.RegistrationServiceApplication;
import com.stackroute.RegistrationService.model.ServiceCenter;
import com.stackroute.RegistrationService.model.User;
import com.stackroute.RegistrationService.repo.UserRepository;

@CrossOrigin
@RestController
@RequestMapping("user/registration")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	@PostMapping
	public ResponseEntity<?> addUser(@RequestBody User c1)
	{
//		Customer c2 = cr.findByCustomerId(c1.getCustomerId());
		if(userRepository.existsById(c1.getEmail()))
		{
			return new ResponseEntity<String>("Customer already exists", HttpStatus.CONFLICT);

		}
		else
		{
			return new ResponseEntity<User>(userRepository.save(c1), HttpStatus.CREATED);
			

		}
		
	}
	
	@Autowired
	RabbitTemplate rabbitTemplate;
	
	@PostMapping ("na/signup")
	public ResponseEntity<?> sendData(@RequestBody User c1)
	{
		rabbitTemplate.convertAndSend(RegistrationServiceApplication.exchange, RegistrationServiceApplication.routingKey, c1);
		rabbitTemplate.convertAndSend(RegistrationServiceApplication.exchange, RegistrationServiceApplication.routingKey1, c1);
		rabbitTemplate.convertAndSend(RegistrationServiceApplication.exchange, RegistrationServiceApplication.routingKey2, c1);
		
		if(userRepository.existsById(c1.getEmail()))
		{
			return new ResponseEntity<String>("Customer already exists", HttpStatus.CONFLICT);

		}
		else
		{
			return new ResponseEntity<User>(userRepository.save(c1), HttpStatus.CREATED);
			

		}
		
	}
	
	@DeleteMapping("delete")
	public ResponseEntity<?> deleteUser(@RequestBody ServiceCenter c1)
	{
		User c2 = userRepository.findByemail(c1.getEmail());
		if(c2 == null)
		{
			return new ResponseEntity<String>("Service Center Not Exist", HttpStatus.OK);
		}
		else {
			userRepository.delete(c2);
		//	customerServiceRepository.save(c3);
			
			return new ResponseEntity<String>("Service Center Deleted", HttpStatus.OK);
			
		}
	}
}

