package com.navarro.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.navarro.languages.models.Language;
import com.navarro.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepository;
	
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	//GET
	// returns all languages
	public List<Language> allLanguages(){
		return languageRepository.findAll();
	}
	// pull one language
	public Language findLang(Long id) {
		Optional<Language> optionalLang = languageRepository.findById(id);
		if(optionalLang.isPresent()) {
			return optionalLang.get();
		} else {
			return null;
		}
	}
	//POST
	// creates a language
	public Language createLanguage(Language newLang) {
		return languageRepository.save(newLang);
	}
	//PUT
	// updates a language
	public Language update(Language newLang) {
		return languageRepository.save(newLang);
	}
	//DELETE
	// deletes a language
	public void delete(Long id) {
		Optional<Language> deleteLang = languageRepository.findById(id);
		if(deleteLang.isPresent()) {
			languageRepository.deleteById(id);
		}
	}
}
