package com.spring.sExam.controller;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.sExam.vo.BTomVO;

@Controller
@RequestMapping("/btom")
public class BtomController {

    @RequestMapping(value = "/b1", method = RequestMethod.GET)
    public String b1Get() {
        return "btom/b1";
    }

    /*
    @RequestMapping(value = "/b2", method = RequestMethod.GET)
    public String b2Get() {
        return "btom/b2";
    }
    */
    /*
    @RequestMapping(value = "/b2", method = RequestMethod.GET)
    public String b2Get(HttpServletRequest request, Model model) {
        String name = request.getParameter("name")==null ? "" : request.getParameter("name");

        model.addAttribute("name", name);

        return "btom/b2";
    }
    */
    @RequestMapping(value = "/b2", method = RequestMethod.GET)
    public String b2Get() {
        return "btom/b2";
    }

    /*
    @RequestMapping(value = "/b2Ok", method = RequestMethod.POST)
    public String b2OkGet(String name,
    		@RequestParam(name="age", defaultValue = "0", required = false) int age, 
    		Model model) {
        System.out.println("name : " + name + " , age : " + age);
        model.addAttribute("name", name);
        model.addAttribute("age", age);

        return "btom/b2";
    }
     */
    
    @RequestMapping(value = "/b2", method = RequestMethod.POST)
    public String b2Post(Model model, HttpServletRequest request) throws UnsupportedEncodingException {
    	request.setCharacterEncoding("utf-8");
    	
    	String name = request.getParameter("name")==null ? "" : request.getParameter("name");
    	int age = request.getParameter("age")==null ? 0 : Integer.parseInt(request.getParameter("age"));
        System.out.println("name : " + name + " , age : " + age);
        
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        
        return "btom/b2";
    }

    
    @RequestMapping(value = "/b3", method = RequestMethod.GET)
    public String b3Get() {
    	
    	return "btom/b3";
    }

    @RequestMapping(value = "/b3", method = RequestMethod.POST)
    public String b3Post(Model model, HttpServletRequest request,
    		@RequestParam(name="name", defaultValue = "", required = false) String name,
    		@RequestParam(name="age", defaultValue = "0", required = false) int age
    		) throws UnsupportedEncodingException {
    	request.setCharacterEncoding("utf-8");

    	System.out.println("name : " + name + " , age : " + age);
        
        model.addAttribute("name", name);
        model.addAttribute("age", age);
        
    	return "btom/b3";
    }
    
    @RequestMapping(value = "/b4", method = RequestMethod.GET)
    public String b4Get() {
    	
    	return "btom/b4";
    }

	/* @RequestMapping(value = "/b4Path/{name}", method = RequestMethod.GET) */
    /* @RequestMapping(value = "/b4Path/{name}/{age}/test", method = RequestMethod.GET) */
    @RequestMapping(value = "/b4Path/{name}-{age}/test", method = RequestMethod.GET)
    // 컨트롤러에 {} 안에 변수명을 담고, .jsp에서는 값을 넘겨서 값을 받을 수 있다. 이 컨트롤러의 경로는 /b4Path/test 인 것이다.
    public String b4PathGet(Model model,
    		@PathVariable String name,
    		@PathVariable String age
    		) {
    	model.addAttribute("name", name);
    	model.addAttribute("age", age);
    	
    	return "btom/b4";
    }
    
    @RequestMapping(value = "/b5", method = RequestMethod.GET)
    public String b5Get() {
    	
    	return "btom/b5";
    }
    
    @RequestMapping(value = "/b5", method = RequestMethod.POST)
    public String b5Post(Model model, 
    		@RequestParam(name="name") String name,
    		@RequestParam(name="age", defaultValue = "0", required = false) int age,
    		@RequestParam(name="mid") String mid,
    		@RequestParam(name="pwd") String pwd,
    		@RequestParam(name="gender") String gender,
    		@RequestParam(name="address") String address
			/* @RequestParam 어노테이션을 사용할 때 자동으로 타입 변환과 기본값 처리를 지원 */
    		) {
    	
    	model.addAttribute("name", name);
    	model.addAttribute("age", age);
    	model.addAttribute("mid", mid);
    	model.addAttribute("pwd", pwd);
    	model.addAttribute("gender", gender);
    	model.addAttribute("address", address);
    	
    	return "btom/b5";
    }
    
    @RequestMapping(value = "/b6", method = RequestMethod.GET)
    public String b6Get() {
    	
    	return "btom/b6";
    }
    
    @RequestMapping(value = "/b6", method = RequestMethod.POST)
    public String b6Post(Model model, 
    		@RequestParam(name="name") String name,
    		@RequestParam(name="age", defaultValue = "0", required = false) int age,
    		@RequestParam(name="mid") String mid,
    		@RequestParam(name="pwd") String pwd,
    		@RequestParam(name="gender") String gender,
    		@RequestParam(name="address") String address
    		
    		) {
    	
//    	model.addAttribute("name", name);
//    	model.addAttribute("age", age);
//    	model.addAttribute("mid", mid);
//    	model.addAttribute("pwd", pwd);
//    	model.addAttribute("gender", gender);
//    	model.addAttribute("address", address);
    	
    	BTomVO vo = new BTomVO();
    	
    	vo.setName(name);
    	vo.setAge(age);
    	vo.setMid(mid);
    	vo.setPwd(pwd);
    	vo.setGender(gender);
    	vo.setAddress(address);
    	
    	model.addAttribute("vo", vo);
    	
    	return "btom/b6";
    }
    
    @RequestMapping(value = "/b7", method = RequestMethod.GET)
    public String b7Get() {
    	
    	return "btom/b7";
    }
    
    @RequestMapping(value = "/b7", method = RequestMethod.POST)
    public String b7Post(Model model, BTomVO vo) {
    	
//    	vo.setName(name);
//    	vo.setAge(age);
//    	vo.setMid(mid);
//    	vo.setPwd(pwd);
//    	vo.setGender(gender);
//    	vo.setAddress(address);

    	System.out.println("vo_toString : " + vo);
    	
    	model.addAttribute("vo", vo);
    	
    	return "btom/b7";
    }
    
    @RequestMapping(value = "/b8", method = RequestMethod.GET)
    public String b8Get() {
    	return "btom/b8";
    }
}
