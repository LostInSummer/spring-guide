package com.lostinsummer.spring.consuming.rest;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringRestfulWebConsumeApplication2 {

	private static final Logger log = LoggerFactory.getLogger(SpringRestfulWebConsumeApplication2.class);

	public static void main(String args[]) {
		SpringApplication.run(SpringRestfulWebConsumeApplication2.class);
		System.out.println(Arrays.toString(args));
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
			Greeting greeting = restTemplate.getForObject("http://localhost:8080/greeting", Greeting.class);
			log.info(greeting.toString());
		};
	}

}
