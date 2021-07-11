package com.studyforlife.configapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigServer
@SpringBootApplication
public class BflConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BflConfigServerApplication.class, args);
	}

}
