package com.spring.sExam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/ctom")
public class CtomController {
	
	@RequestMapping(value = "/c1", method = RequestMethod.GET)
	public String c1Get(@RequestParam(name="flag", defaultValue = "", required = false) String flag) {
		
		if(flag.equals("OK")) {
			System.out.println("c1Service2를 다녀왔습니다.");
		}
		
		return "ctom/c1";
	}

	@RequestMapping(value = "/c1Service", method = RequestMethod.GET)
	public String c1ServiceGet() {
		System.out.println("이곳은 c1Service 입니다.");
		System.out.println("지금은 작업 중......");
		System.out.println("작업 끝");
		
		// 이건 .jsp 파일을 호출한 것
		// return "ctom/c1";
		
		// 이건 컨트롤러가 컨트롤러를 호출한 것, redirect: 다음은 컨트롤러의 이름
		return "redirect:/ctom/c1";
	}
	
	@RequestMapping(value = "/c1Service2", method = RequestMethod.GET)
	public String c1Service2Get() {
		System.out.println("이곳은 c1Service2 입니다.");
		System.out.println("지금은 작업 중2......");
		System.out.println("작업 끝2");
		
//		return "redirect:/ctom/c1";
		return "redirect:/ctom/c1?flag=OK";
	}
	
}
