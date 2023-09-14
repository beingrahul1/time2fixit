package com.stackroute.TrackingService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stackroute.TrackingService.model.Tracking;

@Service
public interface TrackingService {

	Tracking save(Tracking tracking);

	Tracking update(Tracking tracking);

	List<Tracking> getTracking();

	String deleteTracking(int bookingId);

	Tracking getTracker(int bookingId);

}
