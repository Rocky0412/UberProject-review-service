package org.example.uberreviewservice.model;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter

public class PassengerReview extends Review {
    private String passengerReviewComment;
    private String passengerRating;
}
