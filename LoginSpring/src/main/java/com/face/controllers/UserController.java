package com.face.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
@RequestMapping("/")
public String home() {
	return "home";
}

@RequestMapping("/login")
public String login() {
	return "Login";
}
@RequestMapping("/registration")
public String registration() {
	return "Registration";
}
	

@RequestMapping("/welcomelogin")
public ModelAndView welcomelogin(HttpServletRequest request,HttpServletResponse response) {
	String uname = request.getParameter("username");
	ModelAndView mv = new ModelAndView();
	mv.setViewName("WelcomeLogin");
	mv.addObject("name",uname);
	
	return mv;
}

	
}
