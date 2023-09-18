package com.stackroute.BookingService.repository;

import java.util.Date;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.BookingService.model.BookingSlot;


@Repository
public interface BookingSlotRepository extends MongoRepository<BookingSlot, Integer> {

	


	BookingSlot findByDateAndTimeAndShopid(Date date, String time, String shopId);
}
