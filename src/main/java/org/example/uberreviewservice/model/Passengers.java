package org.example.uberreviewservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="passengers")
public class Passengers extends BaseModel {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    @OneToMany(mappedBy = "passengers", cascade = CascadeType.ALL)
    List<Booking> bookings=new ArrayList<>();


}
