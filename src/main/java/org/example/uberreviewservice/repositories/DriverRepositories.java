package org.example.uberreviewservice.repositories;

import org.example.uberreviewservice.model.Booking;
import org.example.uberreviewservice.model.Driver;
import org.hibernate.annotations.Fetch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DriverRepositories extends JpaRepository<Driver, Long> {
    Driver findByLicenceNoAndId(String licenceNo, Long id);
    @Query("SELECT DISTINCT d FROM Driver d JOIN FETCH d.bookings WHERE d.id IN :ids")
    List<Driver> findAllByIdIn(@Param("ids") List<Long> ids);
}
