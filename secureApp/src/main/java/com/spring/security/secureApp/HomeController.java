package com.spring.security.secureApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public String home(){
		return "home.jsp";
	}
	
	@RequestMapping("/login")
	public String loginPage(){
		return "login.jsp";
	}
	
	@RequestMapping("/logout")
	public String logoutPage(){
		return "logout.jsp";
	}

}
