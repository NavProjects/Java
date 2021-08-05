package com.navarro.routingpractice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	@RequestMapping("/{place}")
	public String showDojo(@PathVariable("place") String place) {
		if (place.equals("dojo")) {
			return "The dojo is awesome!";
		} else if (place.equals("burbank-dojo")){
			return "Burbank Dojo is located in Southern California";
		} else if (place.equals("san-jose")) {			
			return "SJ dojo is the headquarters'";
		} else {
			return "you searched for: " + place;
		}
	}
}
