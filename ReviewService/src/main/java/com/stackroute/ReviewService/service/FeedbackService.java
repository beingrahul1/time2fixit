package com.stackroute.ReviewService.service;

import java.util.List;

import com.stackroute.ReviewService.model.UserFeedback;

public interface FeedbackService {
    List<UserFeedback> getAllFeedbacks();

    UserFeedback getFeedbackById(String email);

    UserFeedback createFeedback(UserFeedback feedback);

    UserFeedback updateFeedback(String email, UserFeedback feedback);

    void deleteFeedback(String email);
}

