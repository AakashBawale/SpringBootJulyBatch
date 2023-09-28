package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("getMessege")
	public String getMessege() {
		String messege = "This is github practical one";
		return messege;
	}

	public List getEmployeeData() {
		List list = new ArrayList();
		list.add("Ram");
		list.add(10);
		return list;
	}
}
