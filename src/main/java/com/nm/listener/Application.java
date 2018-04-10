package com.nm.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@ComponentScan(basePackages = { "com.nm.listener" })
@EnableJms
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class);
	}
}