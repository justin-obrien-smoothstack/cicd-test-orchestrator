package com.smoothstack.training.cicdtestorchestrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CicdtestorchestratorApplication {

	public static String backendUrl;
	public static String[] staticArgs;
	
	public static void main(String[] args) {
		backendUrl = args[1];
		staticArgs = args;
		SpringApplication.run(CicdtestorchestratorApplication.class, args);
	}

}
