package com.runt.colegio.colegioapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.runt.colegio.colegioapi.entities.Profesor;

/**
 * interfaz que consolida las consultas permitidas por jpa por defecto 
 * @author davidvillota
 *
 */
@Repository
public interface IProferorRepository extends JpaRepository<Profesor, Long> {
	
	

}
