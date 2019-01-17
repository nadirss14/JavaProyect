/**
 * 
 */
package com.nadirss14.util;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author acer-pc
 * Clase para manejar la la seguridad con spring
 * Credenciales reales el archivo .properties
 * Default credential user: user 
 */
@Configuration
@EnableWebSecurity
public class BasicConfiguration  extends WebSecurityConfigurerAdapter {
	protected void configure(HttpSecurity http )throws Exception {
		http.authorizeRequests()
			.anyRequest()
			.authenticated()
			.and()
			.formLogin()
			.and()
			.httpBasic();
	}
}
