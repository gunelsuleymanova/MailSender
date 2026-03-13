package com.example.HBDnotification.hbdNotification.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeRequestDto {
    private String name;
    private String surname;
    private Double balance;

}
