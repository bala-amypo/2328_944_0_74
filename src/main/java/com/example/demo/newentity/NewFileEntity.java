package com.example.demo.newentity;

import java.util.*;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.*;

@Entity
@Table(name="Student")
public class NewFileEntity{
    @Id
    @GeneratedValue(stratergy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "should not contain spaces")
    private String name;
    @NotBlank(message = "should not be empty")
    @Email(message = "it must be an email")
    private String email;
    
     public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public NewFileEntity(Long id, @NotBlank(message = "should not contain spaces") String name,
            @NotBlank(message = "should not be empty") @Email(message = "it must be an email") String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}