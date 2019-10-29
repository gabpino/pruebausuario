package com.example.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@Order(1000) 
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {
    
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    	
        auth.inMemoryAuthentication()
                .withUser("user").password("{noop}password").roles("USER")
                .and()
                .withUser("admin").password("{noop}password").roles("USER", "ADMIN");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers(HttpMethod.GET, "/saveuser/**").permitAll()
                .antMatchers(HttpMethod.POST, "/saveuser").permitAll()
                .antMatchers(HttpMethod.PUT, "/saveuser/**").permitAll()
                .antMatchers(HttpMethod.PATCH, "/saveuser/**").permitAll()
                .antMatchers(HttpMethod.DELETE, "/saveuser/**").permitAll()
                .and()
                .httpBasic().and()
                .csrf().disable()
                .formLogin().disable();
    }

}
