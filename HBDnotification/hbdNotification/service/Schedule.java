package com.example.HBDnotification.hbdNotification.service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class Schedule {

    private final EmployeService employeService;
    @Scheduled(cron = "30 50 11 * * *")
    public void dogugunu(){
        employeService.sendmail();
    }
}
