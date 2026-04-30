package org.example.uberreviewservice.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

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

    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL, fetch = FetchType.LAZY)

    List<Booking> bookings; // A driver as many booking

    {
        bookings = new ArrayList<>();
    }
}
