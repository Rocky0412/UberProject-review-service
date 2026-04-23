package org.example.uberreviewservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="Passengers")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passengers extends  BaseModel{
    private String firstName;
    private String lastName;
    @OneToMany(mappedBy = "passengers")
    private List<Booking> bookings = new ArrayList<>();
}
