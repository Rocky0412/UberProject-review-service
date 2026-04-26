package org.example.uberreviewservice.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Driver")
public class Driver extends BaseModel{

    private String firstName;
    private String lastName;
    @Column(unique = true,nullable = false)
    private String licenceNo;
    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    List<Booking> reviews = new ArrayList<>(); // A driver as many booking
}
