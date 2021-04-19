package com.salesianostriana.dam.todolist;

import com.salesianostriana.dam.todolist.model.Task;
import com.salesianostriana.dam.todolist.model.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}


	@Bean
	public CommandLineRunner init(TaskRepository repository) {
		return args -> {

			repository.save(new Task("Venir a clase el Lunes", LocalDate.now()));

			List<Task> all = repository.findAll();

			all.forEach(System.out::println);

		};
	}



}
