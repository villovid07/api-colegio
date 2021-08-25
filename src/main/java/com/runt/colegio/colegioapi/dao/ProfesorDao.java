package com.runt.colegio.colegioapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.runt.colegio.colegioapi.entities.Profesor;
import com.runt.colegio.colegioapi.repository.IProferorRepository;

/**
 * Clase que permite realizar todas las consultas relacionadas con la tabla profesor
 * @author davidvillota
 *
 */
@Component
public class ProfesorDao {
	
	@Autowired
	private IProferorRepository iProferorRepository;
	
	/**
	 * Metodo que permite realizar la consulta de todos los profesores registrados en el sistema
	 * @return
	 */
	public List<Profesor> findAll(){
		
		return iProferorRepository.findAll();
	}


}
