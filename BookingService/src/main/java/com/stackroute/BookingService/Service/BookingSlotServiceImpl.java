package com.stackroute.BookingService.Service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.BookingService.model.BookingSlot;
import com.stackroute.BookingService.repository.BookingSlotRepository;

@Service
public class BookingSlotServiceImpl implements BookingSlotService {
	
	@Autowired
    BookingSlotRepository bookingSlotRepository;

    

    @Override
    public BookingSlot bookSlot(BookingSlot bookingSlot) {
        return bookingSlotRepository.save(bookingSlot);
    }
    
    @Override
    public BookingSlot findByDateAndTimeAndShopid(Date date, String time, String shopId) {
    	return bookingSlotRepository.findByDateAndTimeAndShopid(date,time, shopId);
    }
}



