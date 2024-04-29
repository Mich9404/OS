package com.example.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftApplication {

	@GetMapping("/")
	public String welcome() {
		return "Welcome to Java";
	}

	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Hi "+input+":)";
	}

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftApplication.class, args);
	}

}
