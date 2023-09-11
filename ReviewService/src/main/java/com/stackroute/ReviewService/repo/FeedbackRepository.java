package com.stackroute.ReviewService.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.ReviewService.model.UserFeedback;

@Repository
public interface FeedbackRepository extends MongoRepository<UserFeedback, Integer> {
}