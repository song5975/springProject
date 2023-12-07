package com.spring.sExam.controller;

import java.io.UnsupportedEncodingException;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @RequestMapping(value = {"/","/h","/aCheck"}, method = RequestMethod.GET)
    // public String home(Locale locale, Model model, HttpServletRequest request) {
    // int age = request.getParameter("age")==null ? 0 :
    // Integer.parseInt(request.getParameter("age"));
    public String home(Locale locale, Model model, HttpServletRequest request,
            @RequestParam(name="age", defaultValue = "0", required = false) int age) {
        logger.info("Welcome home! The client locale is {}.", locale);

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

        String formattedDate = dateFormat.format(date);

        String url = "";
        if(age < 20) url = "a1";
        else if(age >= 20 && age < 30) url = "a2";
        else url = "a3";

        model.addAttribute("serverTime", formattedDate );
        model.addAttribute("name1", "김말숙");
        model.addAttribute("url", url);

        return "home";
    }

    @RequestMapping(value = "/aCheck", method = RequestMethod.POST)
    public String aCheckPost(HttpServletRequest request, HttpServletResponse response, Model model) throws UnsupportedEncodingException {
        //@RequestParam(name="name", defaultValue = "", required = false) String name) throws UnsupportedEncodingException {
        request.setCharacterEncoding("utf-8");

        String name = request.getParameter("name")==null ? "" : request.getParameter("name");
        response.setContentType("text/html; charset=utf-8");
        System.out.println("name : " + name);

        System.out.println("전송된 Path : " + request.getServletPath());

        int age = request.getParameter("age")==null ? 0 : Integer.parseInt(request.getParameter("age"));

        String url = "";
        if(age < 20) url = "a1";
        else if(age >= 20 && age < 30) url = "a2";
        else url = "a3";

        model.addAttribute("name", name);
        model.addAttribute("age", age);
        model.addAttribute("url", url);

        return "home";
    }
}
