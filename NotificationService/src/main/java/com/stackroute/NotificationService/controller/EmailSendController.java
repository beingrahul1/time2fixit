package com.stackroute.NotificationService.controller;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.stackroute.NotificationService.model.Email;
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
    
   @RabbitListener(queues = "otpqueue")
   public void sendOTP(Email e2)
   {
	   this.e1 = e2;
	   String to = e1.getEmail();
	   String[] cc = {"thor@gmail.com","king@gmail.com"};
	   String subject = "OTP Validation";
	   int min = 1000;
	   int max = 9999;
	   int otp =  (int)(Math.random()*(max-min+1)+min);  
	   String body = "OTP for updating your password is "+otp;
//	   MultipartFile[] file = null;
	   emailService.sendMail(to, cc, subject, body);
   }
    
//	@RabbitListener(queues = "BookingQueue")
//	public void getMsg(String message)
//	{
//
//		System.out.println(message);
//	}
	
	



}
