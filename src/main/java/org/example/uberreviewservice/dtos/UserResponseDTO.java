package org.example.uberreviewservice.dtos;


import lombok.*;

@Data
@AllArgsConstructor
@Getter
@NoArgsConstructor
@Setter
@Builder
public class UserResponseDTO {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String password;

}
