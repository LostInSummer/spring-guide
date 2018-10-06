package com.lostinsummer.spring.scheduling.tasks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringScheduledTasksApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(SpringScheduledTasksApplication.class);
	}

}
