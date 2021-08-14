package com.navarro.ninjaDojo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.navarro.ninjaDojo.models.Ninja;

@Repository
public interface NinjaRepo extends CrudRepository<Ninja, Long> {
	// will bring back a list of all Ninjas
	List<Ninja> findAll();
}
