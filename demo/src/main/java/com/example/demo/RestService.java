package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {

	 @GetMapping(path="/name", produces = "application/json")
	 public String getName() {
		 return "suhas jadhav";
	 }
}
