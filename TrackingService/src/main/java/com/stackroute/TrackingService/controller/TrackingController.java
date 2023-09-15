package com.stackroute.TrackingService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stackroute.TrackingService.model.Tracking;
import com.stackroute.TrackingService.service.TrackingService;
@CrossOrigin
@RestController
@RequestMapping("track")

public class TrackingController {
	@Autowired
	TrackingService trackingService;
	
	@PostMapping
	public Tracking saveTracking(@RequestBody Tracking tracking)
	{
	return trackingService.save(tracking);	
	}
	
	
	@PutMapping("{bookingId}")
	public Tracking updateTracking(@PathVariable int bookingId,@RequestBody Tracking tracking)
	{
	return trackingService.update(bookingId,tracking);	
	}
	
	@GetMapping
	public List<Tracking> getTracking()
	{
	return trackingService.getTracking();	
	}
	
	@GetMapping("{bookingId}")
	public Tracking getTrackingByBookingId(@PathVariable int bookingId)
	{
	return trackingService.getTracker(bookingId);	
	}
	
	
	@DeleteMapping("{bookingId}")
	public String deleteTrackingById(@PathVariable int bookingId)
	{
	return trackingService.deleteTracking(bookingId);	
	}


}
