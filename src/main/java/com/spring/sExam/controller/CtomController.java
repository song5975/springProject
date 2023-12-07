package com.spring.sExam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/ctom")
public class CtomController {
	
	@RequestMapping(value = "/c1", method = RequestMethod.GET)
	public String c1Get() {
		
		return "ctom/c1";
	}
	
}
