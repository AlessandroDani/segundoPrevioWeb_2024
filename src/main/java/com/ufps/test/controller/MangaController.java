package com.ufps.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ufps.test.services.MangaServices;
import com.ufps.test.entities.*;

@RestController
public class MangaController {
	
	@Autowired
	MangaServices mangaServices;

	@GetMapping("/status")
	public String status() {
		return "SERVIDOR ENCENDIDO";
	}
	
	@GetMapping("/mangas")
	public List<Manga> getMangas(){
		return mangaServices.getMangas();
	}
	
	@GetMapping("/mangas/{id}")
	public Manga getMangas(@PathVariable Integer id){
		return mangaServices.getMangaId(id);
	}
}
