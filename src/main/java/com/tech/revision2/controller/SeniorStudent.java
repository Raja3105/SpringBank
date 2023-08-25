package com.tech.revision2.controller;

import org.springframework.stereotype.Service;

@Service("senior")
public class SeniorStudent implements Student {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "HE IS SENIOR STUDENT";
	}

}
