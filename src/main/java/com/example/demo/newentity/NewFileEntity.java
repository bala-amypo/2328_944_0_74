package com.example.demo.newentity;

import java.util.*;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

public class NewFileEntity{
    @Id
    private Long id;
    @NotBlank(message = "should not contain spaces")
    private String name;
    @NotBlank(message = "should not be empty")
    private String email;

}