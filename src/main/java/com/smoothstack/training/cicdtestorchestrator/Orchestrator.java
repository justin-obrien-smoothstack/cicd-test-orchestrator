package com.smoothstack.training.cicdtestorchestrator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClientResponseException;
import org.springframework.web.client.RestTemplate;

import static com.smoothstack.training.cicdtestorchestrator.CicdtestorchestratorApplication.backendUrl;

@RestController
public class Orchestrator {

	@Autowired
	RestTemplate template;

	@RequestMapping("/")
	public ResponseEntity<String> test(RequestEntity<?> request) {
		try {
			return template.exchange(backendUrl, HttpMethod.GET, request, String.class);
		} catch (RestClientResponseException e) {
			return new ResponseEntity<String>((String) null, HttpStatus.valueOf(e.getRawStatusCode()));
		}
	}

}
