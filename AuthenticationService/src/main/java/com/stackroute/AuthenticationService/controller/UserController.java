package  com.stackroute.AuthenticationService.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.AuthenticationService.AuthenticationServiceApplication;
import com.stackroute.AuthenticationService.model.AuthRequest;
//import com.stackroute.AuthenticationService.model.Technician;
import com.stackroute.AuthenticationService.model.User;
//import com.stackroute.AuthenticationService.repo.TechnicianRepository;
import com.stackroute.AuthenticationService.repo.UserRepository;
import com.stackroute.AuthenticationService.service.UserService;
import com.stackroute.AuthenticationService.util.JwtUtil;


@CrossOrigin
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    RabbitTemplate rabbitTemplate;
    
    @Autowired
    UserService userService;
    
//    @Autowired
//    TechnicianRepository tr;
    
    

    @GetMapping("/test")
    public String welcomeTest() {
        return "Welcome to JWT TOKENS !!";
    }

    
    @GetMapping("/cgitest")
    public String testingEndpoint() {
        return "Welcome to JWT TOKENS !!";
    }
    
    @GetMapping("na/cgitest")
    public String testingNewEndpoint() {
        return "Welcome to JWT TOKENS !!";
    }
    
    User u1;
    
    
    @Autowired
    UserRepository userRepository;
    
    
//    @PostMapping("na/signup")
    
    @RabbitListener(queues = "cgiqueue")
    public void customersignup(User user){
    	this.u1 = user;
    	userRepository.save(u1);
    	
          }
    
//    @PostMapping("na/signup")
//    public User customersignup(@RequestBody User u1)
//    {
//    	return userRepository.save(u1);
//    }


    @PostMapping("na/forgot")
    public ResponseEntity<?> forgotPassword(@RequestBody User u1)
    {
    	User u2 = userRepository.findByEmail(u1.getEmail());
    	if(u2!=null)
    	{
        	rabbitTemplate.convertAndSend(AuthenticationServiceApplication.exchange, AuthenticationServiceApplication.otproutingKey, u1);
    		return new ResponseEntity<String>("OTP Sent Successfuly",HttpStatus.OK);
    	}
    	else
    	{
    		return new ResponseEntity<String>("No User Found with this Email",HttpStatus.OK);
    	}
    	
    	
    }
    
    @PostMapping("na/reset")
    public ResponseEntity<?> resetPassword(@RequestBody User u1)
    {
    	User u2 = userRepository.findByEmail(u1.getEmail());
    	u1.setRole(u2.getRole());
    	userRepository.delete(u2);
    	userRepository.save(u1);
    	return new ResponseEntity<String>("Password Reset Done", HttpStatus.OK);

    }


//    @PostMapping("na/technician/signup")
//    public User techniciansignup(@RequestBody User t1){
//    	
//    	return tr.save(t1);
//    	
//          }
//    
    
//    @PostMapping("na/forgot")
//    public User forgotPassword(@RequestBody User user){
//    	
//    	return userService.findByEmailAndSecQuestionAndSecAnswer(user.getEmail(), user.getSecQuestion(),user.getSecAnswer());
//          } 
    
   
//    @PutMapping("na/reset")
//    public User resetPassword(@RequestBody User user){
//    	
//    	return userService.resetPassword(user);
//          } 
   
    
    
    
    
    @PostMapping("na/login")
    public String generateCustomerToken(@RequestBody AuthRequest authRequest) throws Exception {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword())
            );
        } catch (Exception ex) {
            throw new Exception("inavalid username/password");
        }
        return jwtUtil.generateToken(authRequest.getEmail());
    }
    
    
//    @PostMapping("na/technician/login")
//    public String generateTechnicianToken(@RequestBody AuthRequest authRequest) throws Exception {
//        try {
//            authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword())
//            );
//        } catch (Exception ex) {
//            throw new Exception("inavalid username/password");
//        }
//        return jwtUtil.generateToken(authRequest.getEmail());
//    }
    
    
    
}
