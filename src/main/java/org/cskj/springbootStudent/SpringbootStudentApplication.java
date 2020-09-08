package org.cskj.springbootStudent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootStudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStudentApplication.class, args);
	}

}
