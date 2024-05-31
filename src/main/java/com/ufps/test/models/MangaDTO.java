package com.ufps.test.models;

import java.util.Date;

import lombok.Data;

@Data
public class MangaDTO {
	String nombre;
	Date fecha_lanzamiento;
	Integer temporadas;
	Integer pais_id;
	Integer anime;
	Integer juego;
	Integer pelicula;
	Integer tipo_id;
}
