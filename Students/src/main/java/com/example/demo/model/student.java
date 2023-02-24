package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer studentID;
    private Integer rollNo;
    private String studentName;
    private String email;
    private String password;
    private String course;
    private String MobileNo;

}
