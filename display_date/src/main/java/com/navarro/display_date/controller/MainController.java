package com.navarro.display_date.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
public class MainController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
		}
		else {
			session.setAttribute("count", (Integer) session.getAttribute("count") + 1);
		}
		return "index.jsp";
	}
	
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(HttpSession session ,@RequestParam(value="username") String username, 
    		@RequestParam(value="password") String password) {
          session.setAttribute("username", username);
          session.setAttribute("password", password);
          return "redirect:/dashboard";
    }
    @RequestMapping("/form")
    public String form() {
    	return "login.jsp";
    }
    @RequestMapping("/createError")
    public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "A test error!");
        redirectAttributes.addFlashAttribute("yeet", "YEET!");
        return "redirect:/form";
    }

    @RequestMapping("/dashboard")
    public String dashboard() {
        return "dashboard.jsp";
    }

    	
	
	
	@RequestMapping("/count")
    public String showCount(HttpSession session, Model model) {
        Integer currentCount = (Integer) session.getAttribute("count");
        model.addAttribute("countToShow", currentCount);
        return "showCount.jsp";
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
