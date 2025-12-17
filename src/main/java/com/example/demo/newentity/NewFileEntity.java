package com.example.demo.newentity;

import java.util.*;

import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.*;


public class NewFileEntity{
    @Id
    @GeneratedValue(stratergy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "should not contain spaces")
    private String name;
    @NotBlank(message = "should not be empty")
    @Email(message = "it must be an email")
    private String email;

}