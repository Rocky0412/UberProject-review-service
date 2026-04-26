package org.example.uberreviewservice.services;

import jakarta.transaction.Transactional;
import org.example.uberreviewservice.model.Booking;
import org.example.uberreviewservice.model.Enum.BookingStatus;
import org.example.uberreviewservice.model.Review;
import org.example.uberreviewservice.repositories.BookingRepositories;
import org.example.uberreviewservice.repositories.ReviewRepositories;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    @Autowired
    private ReviewRepositories reviewRepositories;
    @Autowired
    private BookingRepositories bookingRepositories;

    @Transactional
    @Override
    public void run(String @NonNull ... args) throws Exception {
        Review review = Review
                .builder()
                .rating(4)
                .content("Pending State")
                .build();
        Booking b=Booking
                .builder()
                .bookingStatus(BookingStatus.PENDING)
                .bookingAmount(3000)
                .endDate(new Date())
                .startDate(new Date())
                .longDuration(150)
                .bookingReview(review)
                .build();

    }
}
