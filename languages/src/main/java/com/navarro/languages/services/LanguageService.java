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
	// returns all languages
	public List<Language> allLanguages(){
		return languageRepository.findAll();
	}
	// creates a language
	public Language createLanguage(Language newLang) {
		return languageRepository.save(newLang);
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
	// updates a book
	public Language update(Language newLang) {
		return languageRepository.save(newLang);
	}
	// deletes a book
	public void delete(Long id) {
		Optional<Language> deleteLang = languageRepository.findById(id);
		if(deleteLang.isPresent()) {
			languageRepository.deleteById(id);
		}
	}
}
