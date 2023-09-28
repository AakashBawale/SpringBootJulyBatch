package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("getMessege")
	public String getMessege() {
		String messege = "This is github practical one";
		return messege;
	}
}
