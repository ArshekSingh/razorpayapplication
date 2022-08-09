package com.example.razorpayapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@ComponentScan("com.example.razorpayapplication")
@EnableScheduling
@SpringBootApplication
public class RazorpayapplicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RazorpayapplicationApplication.class, args);

	}

}
