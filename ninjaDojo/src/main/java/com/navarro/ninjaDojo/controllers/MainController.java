package com.navarro.ninjaDojo.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.navarro.ninjaDojo.models.Dojo;
import com.navarro.ninjaDojo.models.Ninja;
import com.navarro.ninjaDojo.services.MainService;

@Controller
public class MainController {
	
	@Autowired
	private MainService service;

	//render dashboard
	@GetMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	//DOJO ROUTES
	// RENDER dojo
	// renders create dojo page
	@GetMapping("/dojos")
	public String newDojo(@ModelAttribute Dojo dojo) {
		return "dojo.jsp";
	}
	// GET 
	@GetMapping("/dojos/{id}")
	public String showNinjas(@PathVariable("id") Long id, Model model) {
		Optional<Dojo> doj = service.getDoj(id);
		model.addAttribute("doj", doj.get());
		return "show.jsp";
	}
	// POST
	// POST creates a dojo
	@PostMapping("/dojos")
	public String createDojo(@Valid @ModelAttribute Dojo dojo, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "dojo.jsp";
		}else {
			service.createDojo(dojo);
			return "redirect:/";
		}
	}
	//NINJA ROUTES
	// RENDER ninja
	// renders create ninja page
	@GetMapping("/ninjas")
	public String newNinja(@ModelAttribute Ninja ninja, Model model) {
		model.addAttribute("doa", service.allDojos());
		return "ninja.jsp";
	}
	// GET new Ninja
	// POST
	// POST creates a ninja
	@PostMapping("/ninjas")
	public String createNinja(@Valid @ModelAttribute Ninja ninja, BindingResult bindingResult, Model model) {
		if (bindingResult.hasErrors()) {
			model.addAttribute("doa", service.allDojos());
			return "ninja.jsp";
		} else {
			service.createNinja(ninja);
			return "redirect:/";
		}
	}
	
}
