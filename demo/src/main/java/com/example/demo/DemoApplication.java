package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages="com.example.demo")
@EnableJpaRepositories(basePackages = {"com.example.demo.dao"})
@EntityScan(basePackages = "com.example.demo.dao.entity")
@EnableTransactionManagement
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer{
	
	@Override
    public SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }
 
	public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
