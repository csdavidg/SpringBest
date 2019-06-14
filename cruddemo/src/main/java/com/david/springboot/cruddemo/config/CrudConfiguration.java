package com.david.springboot.cruddemo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class CrudConfiguration extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").hasRole("EMPLOYEE").antMatchers("/leaders/**").hasRole("MANAGER")
				.antMatchers("/systems/**").hasRole("ADMIN").anyRequest().authenticated().and().formLogin()
				.loginPage("/loginPage").loginProcessingUrl("/authenticateUser").permitAll().and().logout().permitAll();
	}

}