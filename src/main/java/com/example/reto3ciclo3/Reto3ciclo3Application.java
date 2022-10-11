package com.example.reto3ciclo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "{com.example.reto3ciclo3}")
@SpringBootApplication

public class Reto3ciclo3Application {

    public static void main(String[] args) {
        SpringApplication.run(Reto3ciclo3Application.class, args);
    }

}
