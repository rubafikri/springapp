package com.rubafikri.serviceregesry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceregesryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceregesryApplication.class, args);
	}

}
