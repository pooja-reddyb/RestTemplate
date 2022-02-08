package com.example.demo.controller;

import java.net.URI;




import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.User;
import com.example.demo.service.ConsumeApiService;
//import com.example.demo.util.FeignServiceUtil;



@RestController
@RequestMapping("/user-client")
//@RefreshScope
public class ConsumeApiController {
	
	@Autowired
	   RestTemplate restTemplate;
	

//	@Value("${user.provider.url}")
//	private String url;

	
	@RequestMapping(value = "/records/get")
	   public String getRecordList() {
	      HttpHeaders headers = new HttpHeaders();
	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	      HttpEntity <String> entity = new HttpEntity<String>(headers);
	      
	      return restTemplate.exchange(
	    		  "http://localhost:8080/mainApp/users/get", HttpMethod.GET, entity, String.class).getBody();
	   }
	
	//	@Autowired
//	private ConsumeApiService service;
//	
//	@Autowired
//	private FeignServiceUtil util;
	
//	@PostMapping
//	public String saveRecord(@RequestBody User user) {
//		return service.saveRec(user);
//	}
//	
//	@GetMapping
//	public ResponseEntity<?> getAll(){
//		return util.getAllUsers();
//	}
	
//	private String baseUrl = "http://localhost:8080";
	
//	@RequestMapping(value = "/addRecord", method = RequestMethod.POST)
//	   public String createProducts(@RequestBody User user) {
//	      HttpHeaders headers = new HttpHeaders();
//	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//	      HttpEntity<User> entity = new HttpEntity<User>(user,headers);
//	      
//	      return restTemplate.exchange(
//	         "http://localhost:8080/addUser", HttpMethod.POST, entity, String.class).getBody();
//	   }
	
//	@RequestMapping(value = "/user", method = RequestMethod.POST)
//	private void addUser() {
//        String url = baseUrl + "/user";
//        User user = new User();
//        user.setName("bindu");
//        user.setAddress("hyd");
//        ResponseEntity<String> responseEntity = restTemplate.postForEntity(url, user, String.class);
//
//        HttpStatus statusCode = responseEntity.getStatusCode();
//        System.out.println("status code - " + statusCode);
//        String userDetails = responseEntity.getBody();
//        System.out.println("response body - " + userDetails);
//        HttpHeaders responseHeaders = responseEntity.getHeaders();
//        System.out.println("response Headers - " + responseHeaders);
//        URI uri = restTemplate.postForLocation(url, user, String.class);
//        System.out.println("uri - " + uri);
//    }


}
