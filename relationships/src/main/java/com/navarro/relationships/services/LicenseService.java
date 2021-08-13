package com.navarro.relationships.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.navarro.relationships.models.License;
import com.navarro.relationships.repositories.LicenseRep;

@Service
public class LicenseService {
	private final LicenseRep licenseRep;
	
	public LicenseService(LicenseRep licenseRep) {
		this.licenseRep = licenseRep;
	}

	//GET
	// get all
	public List<License> allLicense(){
		return licenseRep.findAll();
	}
	//POST
	//creates a license
	public License createLicense(License newLicense) {
		return licenseRep.save(newLicense);
	}
	// geta a license
	public License findLic(Long id) {
		Optional<License> optionalLic = licenseRep.findByPersonIdEquals(id);
		if(optionalLic.isPresent()) {
			return optionalLic.get();
		} else {
			return null;
		}
	}
	//PUT
	public License update(License updateL) {
		return licenseRep.save(updateL);
	}
	//DELETE
	public void delete(Long id) {
		Optional<License> deleteL = licenseRep.findById(id);
		if(deleteL.isPresent()) {
			licenseRep.deleteById(id);
		}
	}
}
