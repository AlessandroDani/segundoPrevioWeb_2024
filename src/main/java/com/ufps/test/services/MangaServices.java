package com.ufps.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ufps.test.entities.Manga;
import com.ufps.test.repositories.MangaRepository;

@Service
public class MangaServices {
	
	@Autowired
	MangaRepository mangaRepository;
	
	public List<Manga> getMangas() {
		return mangaRepository.findAll();
	}
	
	public Manga getMangaId(Integer id) {
		return mangaRepository.getById(id);
	}

}
