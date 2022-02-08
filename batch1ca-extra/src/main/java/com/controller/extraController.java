package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class extraController {
	
	@GetMapping("displaySum")
	String displayFactPage(){
		//
		return "Ex";
		
	}
	


}
