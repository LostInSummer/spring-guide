package com.lostinsummer.spring.consuming.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class SpringRestfulWebConsumeApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringConsumingRestApplication.class);

	public static void main(String args[]) {
		RestTemplate restTemplate = new RestTemplate();
		Greeting greeting = restTemplate.getForObject("http://localhost:8080/greeting", Greeting.class);
		log.info(greeting.toString());
	}

}
