package com.ishara.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@Controller
public class LoginController {
	
	@RequestMapping("/")
	String loginPage(){
		
		return "login";
	}
	
	@RequestMapping (value="/verifyUser",method=RequestMethod.POST)
	String verifyUser(HttpServletRequest request, HttpServletResponse response, Model model){
		
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		if("demo".equals(userName) && "pwd".equals(password) ){
			
			model.addAttribute("user", userName);
			return "mainDashboard";
			
		}
		else{
			model.addAttribute("loginError", "UserName Or Password Incorrect");
			return "login";
		}
		
		
		
	}
	

}
