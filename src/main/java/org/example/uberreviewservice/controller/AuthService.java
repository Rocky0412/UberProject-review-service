package org.example.uberreviewservice.controller;


import org.example.uberreviewservice.dtos.PassengerSignUpDto;
import org.example.uberreviewservice.dtos.UserResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1/auth")
class AuthController {
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @PostMapping("/register")
    ResponseEntity<?> resgisterUser(@RequestBody PassengerSignUpDto passengerSignUpDto) {
        UserResponseDTO responseDTO = UserResponseDTO.
                builder().firstName(passengerSignUpDto.getFirstName()).
                email(passengerSignUpDto.getEmail()).
                password(bCryptPasswordEncoder.encode(passengerSignUpDto.getPassword())).
                phoneNumber(String.valueOf(passengerSignUpDto.getPhoneNumber())).
                build();
        return ResponseEntity.ok().body(responseDTO);
    }
}