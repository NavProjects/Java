package com.navarro.dojo_survey.controller;



import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(HttpSession session,
    		@RequestParam(value="name") String name,
    		@RequestParam(value="location") String location,
    		@RequestParam(value="favlang") String favlang,
    		@RequestParam(value="comment") String comment) {
    		session.setAttribute("name",name);
    		session.setAttribute("location",location);
    		session.setAttribute("favlang",favlang);
    		session.setAttribute("comment",comment);
    		return "redirect:/result";
    }
    @RequestMapping("/result")
    public String result(HttpSession session){
    	session.getAttribute("name");
    	session.getAttribute("location");
    	session.getAttribute("favlang");
    	session.getAttribute("comment");
    	return "result.jsp";
    }
}