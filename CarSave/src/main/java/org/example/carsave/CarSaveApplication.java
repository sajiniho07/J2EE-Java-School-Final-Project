package org.example.carsave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CarSaveApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarSaveApplication.class, args);
	}

}
