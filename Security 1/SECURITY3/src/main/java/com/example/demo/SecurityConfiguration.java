package com.example.demo;

import javax.sql.DataSource;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;

import com.fasterxml.jackson.databind.introspect.WithMember;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter{
	
	
	@Autowired
	DataSource dataSource ;
	
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.jdbcAuthentication()
		.dataSource(dataSource).passwordEncoder(getPasswordEncoder()); //configured to point to embedded data base
		
		
		/*.withDefaultSchema()
		.withUser(
				User.withUsername("sen")
				.password("hello")
				.roles("USER"))
		.withUser(
				User.withUsername("mad")
				.password("hello")
				.roles("ADMIN"));*/
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/user").hasAnyRole("USER","ADMIN")
		.antMatchers("/").permitAll()
		.and().formLogin()
		.and()
		.rememberMe()
	    .tokenValiditySeconds(60) // expiration time: 7 days
	    .key("dummy");   // cookies will survive if restarted
		
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return (new BCryptPasswordEncoder(10));
	}
}
	
