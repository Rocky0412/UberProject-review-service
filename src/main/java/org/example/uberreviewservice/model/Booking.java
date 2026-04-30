package org.example.uberreviewservice.model;

import jakarta.persistence.*;
import lombok.*;
import org.example.uberreviewservice.model.Enum.BookingStatus;

import java.util.Date;


@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Booking")
public class Booking extends BaseModel {

    private Date startDate;
    private Date endDate;
    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;
    private long longDuration;
    private long bookingAmount;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="drive_id")
    private Driver driver;

    @ManyToOne
    @JoinColumn(name = "passenger_id")
    private  Passengers  passengers;



}
