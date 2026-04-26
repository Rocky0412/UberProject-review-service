package org.example.uberreviewservice.repositories;

import org.example.uberreviewservice.model.Booking;
import org.example.uberreviewservice.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepositories extends JpaRepository<Driver, Long> {
    Driver findByLicenceNoAndId(String licenceNo, Long id);
}
