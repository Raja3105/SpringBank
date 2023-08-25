package com.tech.revision2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tech.revision2.entity.Student;

@RestController
public class StudentController {
	@GetMapping("/name/{name}")
	public String name(@PathVariable String name) {
		return "The Student name is"+name;
	}
	@GetMapping("/name2")
	public String id(@RequestParam int id,@RequestParam String name) {
		return "OK";
	}
	@PostMapping("/name3")
	public Student body(@RequestBody Student e) {
		return e ;
	}
	
	

}
