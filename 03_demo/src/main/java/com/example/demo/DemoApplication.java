package com.example.demo;

import com.example.demo.controller.WelcomeController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}



	@Bean
	public CommandLineRunner runner(WelcomeController controller) {
		return args -> {
			controller.welcome();
		};
	}



}
