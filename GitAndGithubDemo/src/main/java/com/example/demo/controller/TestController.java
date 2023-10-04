package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Policy;

@RestController
public class TestController {

	@GetMapping("/getMessege")
	public String getMessege() {
		String messege = "This is github practical one";
		return messege;
	}

	@GetMapping("/employee-data")
	public List getEmployeeData() {
		List list = new ArrayList();
		list.add("Ram");
		list.add(10);
		return list;
	}

	@GetMapping("/get-policy/{id}")
	public ResponseEntity<Policy> getPolicyDetailById(@PathVariable int id) {

		Policy policy = new Policy();
		policy.setId(1);
		policy.setPolicyName("Life Insurance");
		policy.setPolicyId("p101");
		policy.setPolicyType("life time");
		return ResponseEntity.status(HttpStatus.OK).body(policy);
	}

}
