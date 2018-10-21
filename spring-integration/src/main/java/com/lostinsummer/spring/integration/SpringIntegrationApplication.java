package com.lostinsummer.spring.integration;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("/hello/integration.xml")
public class SpringIntegrationApplication {

	public static void main(String[] args) throws IOException {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication
				.run(SpringIntegrationApplication.class, args);
		System.out.println("Hit Enter to terminate");
		System.in.read();
		configurableApplicationContext.close();
	}

}
