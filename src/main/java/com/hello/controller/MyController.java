package com.hello.controller;

 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
@Controller
public class MyController {
 

	
	@GetMapping("/")
	public String home() {
		return  "index";
	}
	@GetMapping("/welcome")
	public String welcome() {
		return  "welcome";
	}
	@GetMapping("/login")
	public String login() {
		return  "login";
	}
	@GetMapping("/denied")
	public String logout() {
		return  "access_denied";
	}
}
