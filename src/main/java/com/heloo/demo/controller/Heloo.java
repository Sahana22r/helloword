package com.heloo.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Heloo {
	
	@GetMapping("/vm")
	public String hello() {
		return "helloworld";
	}
	
	@GetMapping("/virtual")
	public String helloo() {
		return "helloworld!";
	}

}
