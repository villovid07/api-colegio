package com.runt.colegio.colegioapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.runt.colegio.colegioapi.dao.AsignaturaDao;
import com.runt.colegio.colegioapi.dto.AsignaturaProfesorDTO;

/**
 * Controlador que consolida todos los endpoints relacionados con la asignatura 
 * @author davidvillota
 *
 */
@RestController
public class AsignaturaResource {
	
	@Autowired
	private AsignaturaDao asignaturaDao;
	
	/**
	 * endpoint a traves del cual se puede realizar la consulta de las asignaturas de un profesor
	 * @param idProfesor
	 * @return
	 */
	@GetMapping("/asignatura-profesor/{idProfesor}")
	List<AsignaturaProfesorDTO> findAllByProfesor(@PathVariable Long idProfesor){
		
		return asignaturaDao.findAllByProfesor(idProfesor);
		
	}
	
}
