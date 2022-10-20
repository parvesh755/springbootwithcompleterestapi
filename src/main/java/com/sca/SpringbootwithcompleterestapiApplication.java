package com.sca;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@ComponentScan("com.sca")
@EnableJpaRepositories("com.sca.repository")
@EntityScan("com.sca.entity")
public class SpringbootwithcompleterestapiApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(SpringbootwithcompleterestapiApplication.class, args);
	}
	

}
