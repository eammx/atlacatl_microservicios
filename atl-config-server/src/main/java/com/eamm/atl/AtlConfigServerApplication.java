package com.eamm.atl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class AtlConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtlConfigServerApplication.class, args);
	}

}
