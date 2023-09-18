package com.stackroute.TrackingService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stackroute.TrackingService.model.Tracking;

public interface TrackingRepository extends MongoRepository<Tracking, Integer> {

	Tracking findByBookingId(int bookingId);

	Tracking findByuserEmail(String userEmail);

}
