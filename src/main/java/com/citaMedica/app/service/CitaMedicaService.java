package com.citaMedica.app.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.citaMedica.app.modelo.Cita;
import com.citaMedica.app.repositorio.CitaRepositorio;

@Service
public class CitaMedicaService {
	
	@Autowired
	private CitaRepositorio citaRep;
	
	public List<Cita> findAll(){
		return citaRep.findAll();
	}
	
	public Cita findById(Long id){
		return citaRep.findById(id).orElse(null);
	}
	
	public Cita crear(Cita cita) {
		return citaRep.save(cita);
	}
	
	public Cita borrar(Long id) {
		Cita eliminar = findById(id);
		citaRep.delete(eliminar);
		return eliminar;
	}
	

}