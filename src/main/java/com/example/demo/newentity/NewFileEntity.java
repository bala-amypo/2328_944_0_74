package com.example.demo.newentity;

import jakarta.persistence.*;

public class NewFileEntity{
    @Id
    private Long id;
    @Not
    private String name;
    @Column(name = unique)
    private String email;

}