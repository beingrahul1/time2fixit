package com.stackroute.NotificationService.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.multipart.MultipartFile;

import com.stackroute.NotificationService.model.Email;
import com.stackroute.NotificationService.model.OTP;
import com.stackroute.NotificationService.service.EmailService;



@RestController
@RequestMapping("/mail")

public class EmailSendController {
	private EmailService emailService;
    public EmailSendController(EmailService emailService) {
        this.emailService = emailService;
    }

//    @PostMapping("/send")
//    public String sendMail(@RequestParam(value = "file", required = false) MultipartFile[] file, String to, String[] cc, String subject, String body) {
//        return emailService.sendMail(file, to, cc, subject, body);
//    }
//    
    Email e1;
    int sentotp;
    
   @RabbitListener(queues = "otpqueue")
   public void sendOTP(Email e2)
   {
	   this.e1 = e2;
	   String to = e1.getEmail();
	   String[] cc = {"thor@gmail.com","king@gmail.com"};
	   String subject = "OTP Validation";
	   int min = 1000;
	   int max = 9999;
	   sentotp =  (int)(Math.random()*(max-min+1)+min);  
	   String body = "OTP for updating your password is "+sentotp;
//	   MultipartFile[] file = null;
	   emailService.sendMail(to, cc, subject, body);
   }
   
   @PostMapping("otp/validate")
   public ResponseEntity<?> validateOtp(@RequestBody OTP x)
   {
	   if(sentotp == x.getOtp())
	   {
		   return new ResponseEntity<String>("Valid OTP", HttpStatus.OK);
	   }
	   else
	   {
		   return new ResponseEntity<String>("Invalid OTP", HttpStatus.NOT_FOUND);
	   }
   }
    
//	@RabbitListener(queues = "BookingQueue")
//	public void getMsg(String message)
//	{
//
//		System.out.println(message);
//	}
	
	



}
