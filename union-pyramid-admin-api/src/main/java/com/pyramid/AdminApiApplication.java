package com.pyramid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Howie Lee
 */
@EnableCaching
@SpringBootApplication
public class AdminApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminApiApplication.class, args);
	}

}
