package org.example.personsave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PersonSaveApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonSaveApplication.class, args);
    }

}
