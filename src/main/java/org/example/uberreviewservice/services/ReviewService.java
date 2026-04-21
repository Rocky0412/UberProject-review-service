package org.example.uberreviewservice.services;

import org.example.uberreviewservice.model.Review;
import org.example.uberreviewservice.repositories.ReviewRepositories;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class ReviewService implements CommandLineRunner {
    private ReviewRepositories reviewRepositories;
    public ReviewService(ReviewRepositories reviewRepositories) {
        this.reviewRepositories = reviewRepositories;
    }
    @Override
    public void run(String... args) throws Exception {
        Review review = Review.builder()
                .content("Ride was awesome")
                .rating(4.5)
                .build();
        reviewRepositories.save(review);
        review.setRating(4.6);
        reviewRepositories.save(review);
       Review r= reviewRepositories.findById(1L).
               orElseThrow(() -> new RuntimeException("Review not found"));
       r.setRating(5);
       reviewRepositories.save(r);
    }
}
