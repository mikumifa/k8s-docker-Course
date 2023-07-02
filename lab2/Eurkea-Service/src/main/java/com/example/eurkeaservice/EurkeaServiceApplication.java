package com.example.eurkeaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurkeaServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurkeaServiceApplication.class, args);
    }

}
