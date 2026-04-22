package org.example.uberreviewservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bookingreview")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Review extends BaseModel{

    @Column(nullable = false)
    private String content;
    private  double rating;

}
