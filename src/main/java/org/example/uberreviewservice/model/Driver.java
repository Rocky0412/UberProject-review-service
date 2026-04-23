package org.example.uberreviewservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="Driver")
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Driver extends BaseModel{

    @Column(nullable = false)
    private  String licenseNo;
    private String firstName;
    private String lastName;
    @OneToMany( mappedBy = "driver", cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Booking> bookings = new ArrayList<>();
    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Review> reviews = new ArrayList<>();
}
