package com.citaMedica.app;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import com.citaMedica.app.repositorio.CitaRepositorio;




@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})

public class CitaSaludApplication {

	public static void main(String[] args) {
		SpringApplication.run(CitaSaludApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner ejecucion(CitaRepositorio citaRepo) {
		
	return args -> {
		
			
		};		
	}
	
}
