package org.example.uberreviewservice.services;

import org.example.uberreviewservice.model.Booking;
import org.example.uberreviewservice.model.BookingStatus;
import org.example.uberreviewservice.model.Review;
import org.example.uberreviewservice.repositories.BookingRepositories;
import org.example.uberreviewservice.repositories.ReviewRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class ReviewService implements CommandLineRunner {
    private  ReviewRepositories reviewRepositories;
    @Autowired
    private BookingRepositories bookingRepositories;
    public ReviewService(ReviewRepositories reviewRepositories) {
        this.reviewRepositories = reviewRepositories;
    }
    @Override
    public void run(String... args) throws Exception {
        /*** Review review = Review.builder()
                .content("Ride was awesome")
                .rating(4.5)
                .build();
        Booking book= Booking.builder()
                .startTime(new Date())
                .endTime(new Date())
                .bookingStatus(BookingStatus.COMPLETED)
                .review(review)
                .build();
        bookingRepositories.save(book); ***/


    }
}
