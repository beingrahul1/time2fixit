package com.stackroute.ReviewService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.stackroute.ReviewService.model.UserFeedback;
import com.stackroute.ReviewService.service.FeedbackService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    private final FeedbackService feedbackService;

    @Autowired
    public FeedbackController(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @GetMapping
    public List<UserFeedback> getAllFeedbacks() {
        return feedbackService.getAllFeedbacks();
    }

    @GetMapping("/{email}")
    public UserFeedback getFeedbackById(@PathVariable String email) {
        return feedbackService.getFeedbackById(email);
    }

    @PostMapping
    public UserFeedback createFeedback(@RequestBody UserFeedback feedback) {
        return feedbackService.createFeedback(feedback);
    }

    @PutMapping("/{email}")
    public UserFeedback updateFeedback(@PathVariable String email, @RequestBody UserFeedback feedback) {
        return feedbackService.updateFeedback(email, feedback);
    }

    @DeleteMapping("/{email}")
    public void deleteFeedback(@PathVariable String email) {
        feedbackService.deleteFeedback(email);
    }
}
