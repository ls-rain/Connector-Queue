package com.example.mvcwebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.ServerResponse;

@SpringBootApplication
@Controller
public class MvcwebsiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(MvcwebsiteApplication.class, args);
	}

	@GetMapping("/")
	public String index() {
		return "index";
	}
}
