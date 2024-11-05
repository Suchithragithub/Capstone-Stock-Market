package com.capstone.userservice.model;


import java.time.LocalDate;
import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "stocks")
public class User {
	
	@Id
	private Long userId; 
	
    private String username; 
    private String email; 
    private String password; 
    private String firstName; 
    private String lastName; 
    private LocalDate dateOfBirth; 
    private String address; 
    private String phoneNumber; 
    private LocalDateTime registrationDate;

}
