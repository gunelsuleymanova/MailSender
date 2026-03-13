package com.example.HBDnotification.hbdNotification.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeResponseDto {
    private String name;
    private String surname;
    private Double balance;
}
