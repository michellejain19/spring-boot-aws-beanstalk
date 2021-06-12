package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringAwsElasticBeanStackApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAwsElasticBeanStackApplication.class, args);
	}

}

@RestController
class Controller{

	@GetMapping("/getName")
	public String getName(){
		return "Hello Ankit !!! This is a change";
	}
}
