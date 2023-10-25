package com.pksoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class FiveStartHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(FiveStartHotelApplication.class, args);
		System.out.println("spring boot start................fivestart.......");
	}

}


