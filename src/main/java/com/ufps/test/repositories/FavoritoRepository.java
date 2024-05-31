package com.ufps.test.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ufps.test.entities.Favorito;

public interface FavoritoRepository extends JpaRepository<Favorito, Integer> {

}
