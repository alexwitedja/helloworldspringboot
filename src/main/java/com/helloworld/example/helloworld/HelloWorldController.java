package com.helloworld.example.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Controller
@RestController
//
public class HelloWorldController {

	@GetMapping(path = "/")
	public String helloWorld() {
		return "Hello World";
	}
}
