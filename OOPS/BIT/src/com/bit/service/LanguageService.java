package com.bit.service;

import java.util.List;

import com.bit.model.Language;

public interface LanguageService {
	public List<Language> getAllLanguages();
	public Language getLanguageById(Integer id);
}
