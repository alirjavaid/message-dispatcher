package com.example.messagedispatcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:Beans.xml")
public class MessageDispatcherApplication {

	public static void main(String[] args) {
		SpringApplication.run(MessageDispatcherApplication.class, args);
	}

}

