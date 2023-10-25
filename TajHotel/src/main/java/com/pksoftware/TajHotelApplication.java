package com.pksoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;



@EnableDiscoveryClient
@SpringBootApplication
public class TajHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(TajHotelApplication.class, args);
		System.out.println("spring boot started..........................");
	}

}