package com.stackroute.TrackingService.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.TrackingService.model.Tracking;
import com.stackroute.TrackingService.repo.TrackingRepository;
@Service
public class TrackingServiceImpl implements TrackingService {
	@Autowired
	TrackingRepository trackingRepository;

	@Override
	public Tracking save(Tracking tracking) {
		
		return trackingRepository.save(tracking);
	}


	@Override
	public List<Tracking> getTracking() {
	
		return trackingRepository.findAll();
	}


	@Override
	public Tracking getTracker(int bookingId) {

		System.out.println(bookingId);
		return trackingRepository.findByBookingId(bookingId);
	}


	@Override
	public String deleteTracking(int bookingId) {
		Tracking deleteTracking=getTracker(bookingId);
		trackingRepository.delete(deleteTracking);
		return "delete";
	}


	@Override
	public Tracking update(Tracking tracking) {

		return trackingRepository.save(tracking);
	}



}
