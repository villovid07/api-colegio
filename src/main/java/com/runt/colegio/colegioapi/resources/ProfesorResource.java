package com.runt.colegio.colegioapi.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.runt.colegio.colegioapi.dao.ProfesorDao;
import com.runt.colegio.colegioapi.entities.Profesor;

/**
 * Clase que consolida los endpoints relacionados al profesor
 * @author davidvillota
 *
 */
@RestController
public class ProfesorResource {
		
	@Autowired
	private ProfesorDao profesorDao;
	
	/**
	 * Endpoint que permite la consulta de todos los profesores registrados en el sistema
	 * @return
	 */
        @CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/profesor")
	public List<Profesor> findAll(){
		return this.profesorDao.findAll();
	}

}
