package com.smoothstack.training.cicdtestorchestrator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class BeanConfig {
	@Bean
	public RestTemplate getRestTeplate() {
		return new RestTemplate();
	}
}