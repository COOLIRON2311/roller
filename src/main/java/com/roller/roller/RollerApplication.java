package com.roller.roller;

import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RollerApplication {
	public static Random rand = new Random();

	public static void main(String[] args) {
		SpringApplication.run(RollerApplication.class, args);
	}
}
