package com.navarro.hellohuman;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@RequestMapping("/")
	public String index(@RequestParam(value = "name", required=false) String name,@RequestParam(value = "lname", required=false) String lname) {
		if (name == null) {
			return "<h1>Hello Human!</h1>" +  "<br>" + "Welcome to SpringBoot!" ;
		} else {
			return "<h1>Hello " + name + " " + lname + "</h1>" + "<br>" + "Welcome to SpringBoot!";
		}
	}
}
