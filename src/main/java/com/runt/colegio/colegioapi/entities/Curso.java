package com.runt.colegio.colegioapi.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "curso" )
public class Curso implements Serializable{
	
	/**
	 *  atributo serial
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="grado")
	private Integer grado;
	
	@Column(name="salon")
	private String salon;
	
	@ManyToOne
	@JoinColumn(name="idcolegio")
	private Colegio colegio; 
	
	public Curso() {
		// constructor por defecto
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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

	/**
	 * @return the colegio
	 */
	public Colegio getColegio() {
		return colegio;
	}

	/**
	 * @param colegio the colegio to set
	 */
	public void setColegio(Colegio colegio) {
		this.colegio = colegio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((colegio == null) ? 0 : colegio.hashCode());
		result = prime * result + ((grado == null) ? 0 : grado.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((salon == null) ? 0 : salon.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (colegio == null) {
			if (other.colegio != null)
				return false;
		} else if (!colegio.equals(other.colegio))
			return false;
		if (grado == null) {
			if (other.grado != null)
				return false;
		} else if (!grado.equals(other.grado))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (salon == null) {
			if (other.salon != null)
				return false;
		} else if (!salon.equals(other.salon))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", grado=" + grado + ", salon=" + salon + ", colegio=" + colegio + "]";
	}

}
