package com.example.HBDnotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class HbDnotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(HbDnotificationApplication.class, args);
	}

}
