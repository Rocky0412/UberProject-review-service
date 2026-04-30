package org.example.uberreviewservice.services;

import jakarta.transaction.Transactional;
import org.example.uberreviewservice.model.Booking;
import org.example.uberreviewservice.model.Driver;
import org.example.uberreviewservice.model.Enum.BookingStatus;
import org.example.uberreviewservice.model.Review;
import org.example.uberreviewservice.repositories.BookingRepositories;
import org.example.uberreviewservice.repositories.DriverRepositories;
import org.example.uberreviewservice.repositories.ReviewRepositories;
import org.jspecify.annotations.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ReviewService implements CommandLineRunner {

    @Autowired
    private ReviewRepositories reviewRepositories;
    @Autowired
    private BookingRepositories bookingRepositories;
    @Autowired
    private DriverRepositories driverRepositories;

    @Transactional
    @Override
    public void run(String @NonNull ... args) throws Exception {


   }
}
