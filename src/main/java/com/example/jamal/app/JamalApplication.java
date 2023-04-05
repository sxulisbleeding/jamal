package com.example.jamal.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@ComponentScan(basePackages = "com.example.jamal")
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.example.jamal"})  // scan JPA entities
@EnableJpaRepositories(basePackages = {"com.example.jamal"})
public class JamalApplication {
    public static void main(String[] args) {
        SpringApplication.run(JamalApplication.class, args);
    }
}
