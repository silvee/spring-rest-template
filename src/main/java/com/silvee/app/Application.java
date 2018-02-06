package com.silvee.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.silvee")             //used for scanning components like controllers and services
@EnableJpaRepositories(basePackages = "com.silvee.repo")//
@EntityScan(basePackages = "com.silvee.domain")         //scanning entities, yes
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}