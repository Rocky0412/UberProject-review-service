package org.example.uberreviewservice.model;

import jakarta.persistence.*;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "BookingReview")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Review extends BaseModel{

    @Column(nullable = false)
    private String content;
    private  double rating;

}
