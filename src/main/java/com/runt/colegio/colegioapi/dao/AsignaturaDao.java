package com.runt.colegio.colegioapi.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.runt.colegio.colegioapi.dto.AsignaturaProfesorDTO;
import com.runt.colegio.colegioapi.entities.Asignatura;


/**
 * Clase encargada de realizar las consultas en la base de datos 
 * relacionadas con la tabla asignatura
 * @author davidvillota
 *
 */
@Component
public class AsignaturaDao {
	
	@Autowired
	private EntityManager em;

	/**
	 * Metodo que permite realizar la consulta de las asignaturas de un profesor dado el identificador
	 * @param idProfesor -identificador del profesor
	 * @return
	 */
	public List<AsignaturaProfesorDTO> findAllByProfesor (Long idProfesor){
		
		List<AsignaturaProfesorDTO> lstResultado = new ArrayList<>();
		Query nquery = em.createNamedQuery("AsignaturaByProfesor");
		nquery.setParameter("idProfesor", idProfesor);	
		
		List<Asignatura> resultado = nquery.getResultList();
		
		for(Asignatura ires : resultado) {
			lstResultado.add(new AsignaturaProfesorDTO(
					ires.getId(), ires.getNombre(), ires.getProfesor().getId(),
					ires.getCurso().getGrado(), ires.getCurso().getSalon()
					));
		}
		
		return lstResultado;
		
	}
	
	

}
