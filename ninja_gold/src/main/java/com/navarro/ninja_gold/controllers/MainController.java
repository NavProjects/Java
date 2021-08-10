package com.navarro.ninja_gold.controllers;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("myGold") == null ) {
			session.setAttribute("myGold", 0);
		}
		if(session.getAttribute("activity") == null) {
			ArrayList<String> activity = new ArrayList<String>();
			session.setAttribute("activity", activity);
		}
		return "index.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}


	@RequestMapping(value="/{form}", method=RequestMethod.POST)
	public String farm(@PathVariable("form") String form, HttpSession session) {
		Random rand = new Random();
		if(form.equals("farm")) {
			int low = 10;
			int high = 21;
			int result = rand.nextInt(high-low) + low;
			((ArrayList<String>) session.getAttribute("activity")).add("You entered a farm and earned " + result + " gold. " + "(" + getDate() + ")");
			System.out.println(session.getAttribute("activity"));
			session.setAttribute("myGold", (int)session.getAttribute("myGold") + result);
			return "redirect:/";
		}
		else if (form.equals("cave")) {
			int low = 5;
			int high = 11;
			int result = rand.nextInt(high-low) + low;
			((ArrayList<String>) session.getAttribute("activity")).add("You entered a cave and earned " + result + " gold. " + "(" + getDate() + ")");
			session.setAttribute("myGold", (int)session.getAttribute("myGold") + result);
			return "redirect:/";
		}
		else if (form.equals("house")) {
			int low = 2;
			int high = 6;
			int result = rand.nextInt(high-low) + low;
			((ArrayList<String>) session.getAttribute("activity")).add("You entered a house and earned " + result + " gold. " + "(" + getDate() + ")");
			session.setAttribute("myGold", (int)session.getAttribute("myGold") + result);
			return "redirect:/";
		}
		else {
			int low = -50;
			int high = 51;
			int result = rand.nextInt(high-low) + low;
			if (result < 0) {				
				((ArrayList<String>) session.getAttribute("activity")).add("You entered a casino and lost " + result + " gold. " + "(" + getDate() + ")");
			}
			else if ( result > 0) {
				((ArrayList<String>) session.getAttribute("activity")).add("You entered a casino and earned " + result + " gold. " + "(" + getDate() + ")");
			}
			session.setAttribute("myGold", (int)session.getAttribute("myGold") + result);
			return "redirect:/";
		}
	}
	private String getDate() {
		Date date = new Date();
    	DateFormat dateformat = new SimpleDateFormat("MMMM d y h':'mm aa");
    	String time = dateformat.format(date);
    	return time;
    }

}
