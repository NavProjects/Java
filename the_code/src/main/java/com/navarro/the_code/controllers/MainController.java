package com.navarro.the_code.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class MainController {
		
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(RedirectAttributes redirectAttributes,HttpSession session,
    		@RequestParam(value="password") String password) {
    	if (password.equals("bushido")) {
    		session.setAttribute("code", password);
    		return "redirect:/dash";
    	}else {
    		redirectAttributes.addFlashAttribute("error", "You must train harder!");
    		return "redirect:/";
    	}
    }
    @RequestMapping("/dash")
    public String dashboard(HttpSession session) {
    	if (session.getAttribute("code") != null){
	    	if (session.getAttribute("code").equals("bushido")){
	    		return "dash.jsp";
	    	}
	    	else {
	    		return "redirect:/";
	    	}
    	}else {
    		return "redirect:/";
    	}
    }
}
