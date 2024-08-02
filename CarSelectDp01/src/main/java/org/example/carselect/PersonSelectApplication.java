package org.example.carselect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PersonSelectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonSelectApplication.class, args);
	}

}
