package com.v2.houserent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class HouseRentApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseRentApplication.class, args);
	}
}
