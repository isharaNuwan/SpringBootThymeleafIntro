package com.ishara.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ContactController {
	
	@RequestMapping (value="/contact",method=RequestMethod.GET)
	String contactMapping(HttpServletRequest request, HttpServletResponse response){
		
		
		
		return "contact";
	}

}
