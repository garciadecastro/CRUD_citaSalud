package com.citaMedica.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Override
	public void configure(final AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
		       .withUser("jefe")
		       .password(passwordEncoder().encode("jefepass"))
		       .roles("ADMIN")
		       ;
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		      .antMatchers("/","/css/**","/webjars/**").permitAll()
		      .antMatchers("/crear").hasRole("USER")
		      .antMatchers("/login*").permitAll()
		      .anyRequest().authenticated()
		      .and()
		      .formLogin()
		      ;
		
		
	}
	
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}