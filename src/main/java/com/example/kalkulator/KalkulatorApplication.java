package com.example.kalkulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class KalkulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(KalkulatorApplication.class, args);
		Calculator calculator = new Calculator();
	}
}
