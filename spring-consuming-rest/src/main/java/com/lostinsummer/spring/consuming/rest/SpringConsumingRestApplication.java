package com.lostinsummer.spring.consuming.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

public class SpringConsumingRestApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringConsumingRestApplication.class);

	public static void main(String args[]) {
		RestTemplate restTemplate = new RestTemplate();
		Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
		log.info(quote.toString());
	}

}
