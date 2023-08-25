package com.tech.revision2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentControler {
	@Autowired
	@Qualifier("senior")
	Student st;
	@GetMapping ("/getmessage")
	public String getMessage() {
		return st.getMessage();
	}
	
	@Value("raja")
	private String name;
	@GetMapping("/get1")
	public String getname() {
		return name;
	}
	
	@Value("${defaultName}")
	private String name2;
    @GetMapping("/get12")
    public String getname1() {
	return name2;
}
}
