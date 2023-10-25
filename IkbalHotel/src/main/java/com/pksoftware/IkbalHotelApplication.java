package com.pksoftware;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@EnableDiscoveryClient
@SpringBootApplication
public class IkbalHotelApplication {

	public static void main(String[] args) {
		SpringApplication.run(IkbalHotelApplication.class, args);
		System.out.println("spring started  ikbal hotel...........");
	}

}
