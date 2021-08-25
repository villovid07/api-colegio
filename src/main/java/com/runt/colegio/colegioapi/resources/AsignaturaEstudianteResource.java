package com.runt.colegio.colegioapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.runt.colegio.colegioapi.dao.AsignaturaEstudianteDao;
import com.runt.colegio.colegioapi.entities.Estudiante;

/**
 * Controlador que permite consolidar los endpoints relacionados con asignaturas por estudiante 
 * @author davidvillota
 *
 */
@RestController
public class AsignaturaEstudianteResource {

	@Autowired
	private AsignaturaEstudianteDao asignaturaEstudianteDao;
	
	
	/**
	 * Endpoint que permite realizar la consulta de los estudiantes dada una asignatura especifica
	 * @param idAsignatura
	 * @return
	 */
        @CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/estudiantes-asignatura/{idAsignatura}")
	public List<Estudiante> findAllEstudianteByAsignatura(@PathVariable Long idAsignatura){
		
		return this.asignaturaEstudianteDao.findAllEstudianteByAsignatura(idAsignatura);

	}
	
	
	
}
