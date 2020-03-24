package com.citaMedica.app.repositorio;



import org.springframework.data.jpa.repository.JpaRepository;


import com.citaMedica.app.modelo.Cita;


public interface CitaRepositorio extends JpaRepository<Cita, Long> {
	

    
}
