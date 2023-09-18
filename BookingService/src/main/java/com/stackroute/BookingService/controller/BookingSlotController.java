package com.stackroute.BookingService.controller;


import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.stackroute.BookingService.BookingServiceApplication;
import com.stackroute.BookingService.model.BookingSlot;
import com.stackroute.BookingService.Service.BookingSlotService;
import com.stackroute.BookingService.repository.BookingSlotRepository;

@CrossOrigin
@RestController
@RequestMapping("/bookings")
public class BookingSlotController {
	
	@Autowired
	RabbitTemplate rabbitTemplate;

	@Autowired
	BookingSlotService bookingSlotService;

	@Autowired
    BookingSlotRepository bookingSlotRepository;
	

    

    @PostMapping("/create")
    public ResponseEntity<BookingSlot> createBookingSlot(@RequestBody BookingSlot bookingSlot) {
    	BookingSlot data=bookingSlotService.findByDateAndTimeAndShopid(bookingSlot.getDate(),bookingSlot.getTime(),bookingSlot.getShopid());
       System.out.println(data);
    	if (data != null) {
        	System.out.println(bookingSlot);
           return ResponseEntity.status(HttpStatus.CONFLICT).body(bookingSlot); // Return a conflict response
        }
    	 System.out.println(bookingSlot);
        BookingSlot newData=bookingSlotRepository.save(bookingSlot);
        return ResponseEntity.status(HttpStatus.CREATED).body(bookingSlot);
    }
    
    @PostMapping ("send")
	public String sendData(@RequestBody BookingSlot bookingSlot)
	{
		
		rabbitTemplate.convertAndSend(BookingServiceApplication.exchange,BookingServiceApplication.routingKey,bookingSlot);
		return "msg sent";
		
	}

}


