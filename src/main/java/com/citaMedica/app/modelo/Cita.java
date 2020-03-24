package com.citaMedica.app.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

@Entity
public class Cita {

	@Id @GeneratedValue
	private Long id;
	
	@NotEmpty
	private String paciente;
	
	@NotEmpty
	private String fechaCita;
	
	
	public Cita() {
		super();

	}
	
	public Cita(String paciente, String fechaCita) {
		super();
		this.paciente = paciente;
		this.fechaCita = fechaCita;
	}
	

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(String fechaCita) {
		this.fechaCita = fechaCita;
	}
	

	public String getPaciente() {
		return paciente;
	}

	public void setPaciente(String paciente) {
		this.paciente = paciente;
	}
	
}