package com.feature.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.web.config.EnableSpringDataWebSupport;


@Configuration
@EnableSpringDataWebSupport
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = {"com.feature"})
@ComponentScan(basePackages = {"com.feature"})
@EntityScan(basePackages = {"com.feature"})
@SpringBootApplication
public class FeatureApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeatureApplication.class, args);
	}
}
