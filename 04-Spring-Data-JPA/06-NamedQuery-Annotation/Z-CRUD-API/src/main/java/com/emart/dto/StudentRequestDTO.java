package com.emart.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentRequestDTO {

    @NotNull(message = "Roll number is required")
    @Positive(message = "Roll number must be a positive integer")
    private Integer rno;
    
    @NotBlank(message = "Name Cannot be null/Empty or Blank")
    @Size(min = 2, max = 50, message = "Student Must be within 2 to 50 character")
    private String name;
    
    @NotNull(message = "Age is Required")
    @Min(value = 18, message = "Student Must be Atleast 18 Years Old")
    private Integer age;
    
    @NotBlank(message = "Student Email cannot be Blank")
    @Email(message = "Please provide a valid email address")
    private String email;
    
    @NotBlank(message = "Subject Should Not be Blank")
    private String subject;
}