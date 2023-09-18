package com.stackroute.BookingService.Service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.stackroute.BookingService.model.BookingSlot;

@Service
public interface BookingSlotService {
    BookingSlot bookSlot(BookingSlot bookingSlot);

	BookingSlot findByDateAndTimeAndShopid(Date date, String time, String shopId);
}



