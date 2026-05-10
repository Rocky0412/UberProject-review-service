package org.example.uberreviewservice.dtos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PassengerSignUpDto {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;
}
