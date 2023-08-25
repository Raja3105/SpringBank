package com.tech.revision2.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("junior")
@Primary
public class JuniorStudent implements Student {

	@Override
	public String getMessage() {
		
		return "HE IS JUNIOR STUDENT";
	}
	

}
