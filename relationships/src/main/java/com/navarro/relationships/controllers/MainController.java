package com.navarro.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.navarro.relationships.models.License;
import com.navarro.relationships.models.Person;
import com.navarro.relationships.services.LicenseService;
import com.navarro.relationships.services.PersonService;

@Controller
public class MainController {
	private final LicenseService licenseService;
	private final PersonService personService;

	public MainController(LicenseService licenseService, PersonService personService) {
		this.licenseService = licenseService;
		this.personService = personService;
	}
	
	@RequestMapping("persons/new")
	public String index(@ModelAttribute("person") Person person) {
		return "/driversLicense/index.jsp";
	}
    // creates a person
    @RequestMapping(value="/person", method=RequestMethod.POST)
    public String create(@Valid @ModelAttribute("person") Person person, BindingResult result) {
        if (result.hasErrors()) {
            return "/persons/index.jsp";
        } else {
            personService.createPerson(person);
            return "redirect:/persons/new";
        }
    }
    // render create license
	@RequestMapping("licenses/new")
	public String peeps(@ModelAttribute("license") License license, Model model) {
		List<Person> persons = personService.allPerson();
		model.addAttribute("persons", persons);
		return "/driversLicense/license.jsp";
	}
    @RequestMapping(value="/license", method=RequestMethod.POST)
    public String createLic(@Valid @ModelAttribute("license") License license, BindingResult result, Model model) {
        if (result.hasErrors()) {
    		List<Person> persons = personService.allPerson();
    		model.addAttribute("persons", persons);
            return "/driversLicense/license.jsp";
        } else {
        	licenseService.createLicense(license);
            return "redirect:/licenses/new";
        }
    }
    // render person and license
    @RequestMapping("persons/{id}")
    public String showLic(@PathVariable("id") Long id, Model model) {
    	Person person = personService.findPerson(id);
    	License license = licenseService.findLic(id);
    	model.addAttribute("license", license);
    	model.addAttribute("person", person);
    	return "/driversLicense/show.jsp";
    }
//    String number = String.format("%06d", liceService.allLicenses().size());


}
