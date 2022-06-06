package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Project1Application.class, args);
		Store s = context.getBean(Store.class);
		s.buy_device();
	}

}
