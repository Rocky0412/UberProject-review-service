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


//        Optional<Driver> driver = Optional.ofNullable(driverRepositories.findByLicenceNoAndId("DH123", 1L));
//        if(driver.isPresent()) {
//            Driver d = driver.get();   // ✅ extract actual object
//            System.out.println(d.getFirstName());
//            List<Booking> bookings = d.getBookings();
//            for (Booking booking : bookings) {
//                System.out.println(booking.getId());
//            }
//
//        }
//        System.out.println("Facing N+1 problems");
//        List<Driver> drivers = driverRepositories.findAll();
//        if(!drivers.isEmpty()){
//            for(Driver d:drivers){
//                System.out.println(d.getLicenceNo());
//                System.out.println("==============================");
//                for(Booking book : d.getBookings()){
//                    System.out.println(book.getBookingStatus());
//                }
//                System.out.println("==============================");
//            }
//        }
        List<Driver> drivers = driverRepositories.findAllByIdIn((List.of(1L,2L)));
        for (Driver driver : drivers) {
            for(Booking book : driver.getBookings()){
                System.out.println(book.getDriver().getId());
            }
        }

   }
}
