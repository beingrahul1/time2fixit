package com.stackroute.ReviewService.service;

import java.util.List;

import com.stackroute.ReviewService.model.UserFeedback;

public interface FeedbackService {
    List<UserFeedback> getAllFeedbacks();

    UserFeedback getFeedbackById(int id);

    UserFeedback createFeedback(UserFeedback feedback);

    UserFeedback updateFeedback(int id, UserFeedback feedback);

    void deleteFeedback(int id);
}

