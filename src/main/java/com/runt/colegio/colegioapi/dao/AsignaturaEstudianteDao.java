package com.runt.colegio.colegioapi.dao;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.runt.colegio.colegioapi.entities.AsignaturaEstudiante;
import com.runt.colegio.colegioapi.entities.Estudiante;

/**
 * Clase encargada de realizar todas las consultas relacionadas con los registros de asignaturas por 
 * estudiante 
 * @author davidvillota
 *
 */
@Component
public class AsignaturaEstudianteDao {

	@Autowired
	private EntityManager em; 
	
	/**
	 * Metodo que permite realizar la busqueda de estudiantes dada una asignatura especifica
	 * @param idAsignatura
	 * @return
	 */
	public List<Estudiante> findAllEstudianteByAsignatura (Long idAsignatura){
		
		Query query = em.createNamedQuery("EstudiantesAsignatura");
		query.setParameter("idAsignatura", idAsignatura);
		
		List<AsignaturaEstudiante>  resultado = query.getResultList();
		
		System.out.print(resultado.size());
		
		List<Estudiante> estudiantes  = resultado.stream().map(item-> item.getEstudiante()).collect(Collectors.toList());
		
		return estudiantes;
		
	}
	
	
}
