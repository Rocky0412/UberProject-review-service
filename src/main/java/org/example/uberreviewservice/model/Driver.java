package org.example.uberreviewservice.model;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Driver")
public class Driver extends BaseModel{

    private String firstName;
    private String lastName;
    @Column(unique = true,nullable = false)
    private String licenceNo;
    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Booking> bookings = new ArrayList<>(); // A driver as many booking
}
