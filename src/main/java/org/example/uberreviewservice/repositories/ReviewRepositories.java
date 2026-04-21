package org.example.uberreviewservice.repositories;

import org.example.uberreviewservice.model.Review;
import org.springframework.boot.CommandLineRunner;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepositories extends JpaRepository<Review, Long> {
}
