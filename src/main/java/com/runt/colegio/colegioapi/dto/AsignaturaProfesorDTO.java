package com.runt.colegio.colegioapi.dto;

import java.io.Serializable;
/**
 * DTO que permite consolidar la informacion que se retorna a la vista en la consulta 
 * de asignaturas por profesor
 * @author davidvillota
 *
 */
public class AsignaturaProfesorDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Long idAsignatura;
	private String nombreAsignatura;
	private Long idProfesor;
	private Integer grado;
	private String salon;
	
	public AsignaturaProfesorDTO() 
	{
		//constructor por defecto
	}
	
	
	public AsignaturaProfesorDTO(Long idAsignatura, String nombreAsignatura, Long idProfesor, Integer grado,
			String salon) {
		super();
		this.idAsignatura = idAsignatura;
		this.nombreAsignatura = nombreAsignatura;
		this.idProfesor = idProfesor;
		this.grado = grado;
		this.salon = salon;
	}
	/**
	 * @return the idAsignatura
	 */
	public Long getIdAsignatura() {
		return idAsignatura;
	}
	/**
	 * @param idAsignatura the idAsignatura to set
	 */
	public void setIdAsignatura(Long idAsignatura) {
		this.idAsignatura = idAsignatura;
	}
	/**
	 * @return the nombreAsignatura
	 */
	public String getNombreAsignatura() {
		return nombreAsignatura;
	}
	/**
	 * @param nombreAsignatura the nombreAsignatura to set
	 */
	public void setNombreAsignatura(String nombreAsignatura) {
		this.nombreAsignatura = nombreAsignatura;
	}
	/**
	 * @return the idProfesor
	 */
	public Long getIdProfesor() {
		return idProfesor;
	}
	/**
	 * @param idProfesor the idProfesor to set
	 */
	public void setIdProfesor(Long idProfesor) {
		this.idProfesor = idProfesor;
	}
	/**
	 * @return the grado
	 */
	public Integer getGrado() {
		return grado;
	}
	/**
	 * @param grado the grado to set
	 */
	public void setGrado(Integer grado) {
		this.grado = grado;
	}
	/**
	 * @return the salon
	 */
	public String getSalon() {
		return salon;
	}
	/**
	 * @param salon the salon to set
	 */
	public void setSalon(String salon) {
		this.salon = salon;
	}
	
}
