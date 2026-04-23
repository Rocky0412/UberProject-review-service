package org.example.uberreviewservice.model;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.TenantId;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Booking")
public class Booking extends BaseModel {


    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;

    private Date startTime;
    private Date endTime;
    private long distance;
    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private  Review review;

}
