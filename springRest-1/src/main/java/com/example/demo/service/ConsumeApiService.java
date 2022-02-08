package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.User;

//@Service
public class ConsumeApiService {
	
//	private RestTemplate restTemplate;
//
//	@Autowired
//	public ConsumeApiService(RestTemplateBuilder restTemplateBuilder) {
//		this.restTemplate = restTemplateBuilder.build();
//	}
//	
//	public String saveRec(User user) {
//		HttpEntity<User> entity = new HttpEntity<>(user);
//		return restTemplate.exchange("http://localhost:8080/addUser", HttpMethod.POST, entity, String.class).getBody();
//	}
//	

	

}
