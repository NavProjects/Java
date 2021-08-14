package com.navarro.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.navarro.languages.models.Language;
import com.navarro.languages.services.LanguageService;

@Controller
public class LanguageController {
	private final LanguageService languageService;

	
	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	
	// GETS all languages
	@RequestMapping("/languages")
	public String index(@ModelAttribute("language") Language language, Model model) {
		List<Language> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
		return "/languages/index.jsp";
	}
	
	
	//POST creates a language
	@RequestMapping(value="/new/languages", method=RequestMethod.POST)
	public String create(@Valid @ModelAttribute("language") Language language, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<Language> languages = languageService.allLanguages();
			model.addAttribute("languages", languages);
			return "/languages/index.jsp";
		} else {
			languageService.createLanguage(language);
			return "redirect:/languages";
		}
	}
	
	
	//GET show edit form page
    @RequestMapping("/languages/{id}/edit")
    public String edit(@PathVariable("id") Long id, Model model) {
        Language languages = languageService.findLang(id);
        model.addAttribute("language", languages);
        return "/languages/edit.jsp";
    }
    
    
    //PUT update method
    @RequestMapping(value="/languages/{id}", method=RequestMethod.PUT)
    public String update(
    		@Valid @ModelAttribute("language") Language language, BindingResult result) {
        if (result.hasErrors()) {
            return "/languages/edit.jsp";
        } else {
            languageService.update(language);
            return "redirect:/languages";
        }
    }
    
    
    
    //GET shows a language details
    @RequestMapping("/languages/{id}/detail")
    public String showLang(@PathVariable("id") Long id, Model model) {
    	Language language = languageService.findLang(id);
    	model.addAttribute("language", language);
    	return"/languages/show.jsp";
    }
    
    
    //DELETE delete 
    @RequestMapping(value="/languages/{id}", method=RequestMethod.DELETE)
    public String destroy(@PathVariable("id") Long id) {
    	languageService.delete(id);
    	return "redirect:/languages";
    }
}
