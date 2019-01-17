package com.nadirss14;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;

@EnableAutoConfiguration
/**
 * @SpringBootApplication(exclude= {SecurityAutoConfiguration.class}) utilizar para deshavilitar las credenciales por defecto
 * @author acer-pc
 *
 */
@SpringBootApplication(exclude= {SecurityAutoConfiguration.class})
public class SiteNadirss14Application {

	public static void main(String[] args) {
		SpringApplication.run(SiteNadirss14Application.class, args);
		 
	}
}
