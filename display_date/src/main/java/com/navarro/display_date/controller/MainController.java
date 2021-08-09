package com.navarro.display_date.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}

	@RequestMapping("/date")
	public String date(Model model) {
		Date date = new Date();
		DateFormat form = new SimpleDateFormat("EEEE', the' d ' of ' MMMM', 'y");
		model.addAttribute("date", form.format(date));
		return "date.jsp";
	}
	
	@RequestMapping("/time")
	public String time(Model model) {
		Date date = new Date();
		DateFormat form = new SimpleDateFormat("h:mm a");
		model.addAttribute("date", form.format(date));
		return "time.jsp";
	}
}
