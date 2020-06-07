package com.application.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloworldApplication {

	public static void main(String[] args) {
		System.out.println("Hello...");
		SpringApplication.run(HelloworldApplication.class, args);
	}
	
	@RequestMapping("/")
	public String home() {
		return "Hello Docker World";
	}
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name",required = false , defaultValue = "world") String name) {
		
		System.out.println("The value is - "+name);
		
		return "Hello Mr. "+name;
		
	}

}
