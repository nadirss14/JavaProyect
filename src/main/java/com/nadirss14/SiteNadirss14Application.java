package com.nadirss14;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan
@EnableAutoConfiguration
public class SiteNadirss14Application {

	public static void main(String[] args) {
		SpringApplication.run(SiteNadirss14Application.class, args);
	}
}
