package com.navarro.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.navarro.relationships.models.Person;
import com.navarro.relationships.repositories.PersonRep;

@Service
public class PersonService {
	private final PersonRep personRep;
	
	public PersonService(PersonRep PersonRep) {
		this.personRep = PersonRep;
	}

	//GET
	// get all
	public List<Person> allPerson(){
		return personRep.findAll();
	}
	// get one
	public Person findPerson(Long id) {
		Optional<Person> optionalPers = personRep.findById(id);
		if(optionalPers.isPresent()) {
			return optionalPers.get();
		}else {
			return null;
		}
	}
	//POST
	//creates a Person
	public Person createPerson(Person newPerson) {
		return personRep.save(newPerson);
	}
	//PUT
	public Person update(Person updateL) {
		return personRep.save(updateL);
	}
	//DELETE
	public void delete(Long id) {
		Optional<Person> deleteL = personRep.findById(id);
		if(deleteL.isPresent()) {
			personRep.deleteById(id);
		}
	}
}

