package com.ufps.test.entities;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "manga")
public class Manga {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	String nombre;
	
	@Column(name = "fecha_lanzamiento")
	Date fechaLanzamiento;
	
	@Column
	Integer temporadas;
	
	@ManyToOne
    @JoinColumn(name = "pais_id")
    private Pais pais;
	
	@ManyToOne
	@JoinColumn(name="tipo_id")
	private Tipo tipo;
    
	@Column
	Integer anime;
	
	@Column
	Integer juego;
	
	@Column
	Integer pelicula;
	
	@JsonIgnore
	@ManyToMany
	@JoinTable(
			name = "favorito",
			joinColumns = @JoinColumn(name = "manga_id"),
			inverseJoinColumns = @JoinColumn(name = "usuario_id"))
	
	public List<Usuario> usuarios;
	
	
}
