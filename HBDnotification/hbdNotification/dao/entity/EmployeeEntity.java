package com.example.HBDnotification.hbdNotification.dao.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "GUNEL_EMPLOYEE")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Double balance;
    private Integer age;
    private String email;
    private LocalDate dob;


}
