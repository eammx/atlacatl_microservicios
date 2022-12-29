package com.eamm.atl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AtlEurekaMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtlEurekaMicroApplication.class, args);
	}

}
