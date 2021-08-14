package com.navarro.ninjaDojo.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navarro.ninjaDojo.models.Dojo;
import com.navarro.ninjaDojo.models.Ninja;
import com.navarro.ninjaDojo.repositories.DojoRepo;
import com.navarro.ninjaDojo.repositories.NinjaRepo;

@Service
public class MainService {

	@Autowired
	private DojoRepo dojoRepo;
	@Autowired
	private NinjaRepo ninjaRepo;
//	shortcut above	
//	private final DojoRepo dojoRepo;
//	private final NinjaRepo ninjaRepo;
//	public MainService() {
//		this.dojoRepo = dojoRepo
//		this.ninjaRepo = ninjaRepo	
//	}
	
// for DOJO
	// GET
	// GET all dojos
	public List<Dojo> allDojos(){
		return dojoRepo.findAll();
	}
	// GET one dojo
	public Optional<Dojo> getDoj(Long id) {
		return dojoRepo.findById(id);
	}

	// POST create dojo
	public Dojo createDojo(Dojo d) {
		return dojoRepo.save(d);
	}
// for NINJA
	// GET
	//GET all Ninjas
	public List<Ninja> allNinjas(){
		return ninjaRepo.findAll();
	}
	// POST create ninja
	public Ninja createNinja(Ninja n) {
		return ninjaRepo.save(n);
	}
}
