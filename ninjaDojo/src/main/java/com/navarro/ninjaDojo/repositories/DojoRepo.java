package com.navarro.ninjaDojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.navarro.ninjaDojo.models.Dojo;

@Repository
public interface DojoRepo extends CrudRepository<Dojo, Long> {
	// will bring back a list of all Dojos
	List<Dojo> findAll();

}
