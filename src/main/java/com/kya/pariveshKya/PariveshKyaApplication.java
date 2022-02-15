package com.kya.pariveshKya;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.kya.*")
public class PariveshKyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PariveshKyaApplication.class, args);
	}

}
