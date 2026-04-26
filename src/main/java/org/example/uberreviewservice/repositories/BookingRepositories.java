package org.example.uberreviewservice.repositories;

import org.example.uberreviewservice.model.Booking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepositories extends JpaRepository<Booking, Long> {

}
