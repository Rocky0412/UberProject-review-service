package org.example.uberreviewservice.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

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
    private String email;
    private String password;
    @OneToMany(mappedBy = "passengers", cascade = CascadeType.ALL)
    List<Booking> bookings=new ArrayList<>();


}
