package com.spring.demo.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TestClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

}
