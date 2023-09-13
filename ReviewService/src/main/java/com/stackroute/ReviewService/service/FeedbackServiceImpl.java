package com.stackroute.ReviewService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackroute.ReviewService.model.UserFeedback;
import com.stackroute.ReviewService.repo.FeedbackRepository;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    private final FeedbackRepository feedbackRepository;

    @Autowired
    public FeedbackServiceImpl(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    @Override
    public List<UserFeedback> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    @Override
    public UserFeedback getFeedbackById(String email) {
        return feedbackRepository.findById(email).orElse(null);
    }

    @Override
    public UserFeedback createFeedback(UserFeedback feedback) {
        return feedbackRepository.save(feedback);
    }

    @Override
    public UserFeedback updateFeedback(String email, UserFeedback feedback) {
        if (feedbackRepository.existsById(email)) {
            feedback.setEmail(email);
            return feedbackRepository.save(feedback);
        }
        return null;
    }

    @Override
    public void deleteFeedback(String email) {
        feedbackRepository.deleteById(email);
    }

	
}
