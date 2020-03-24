package com.citaMedica.app.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

import com.citaMedica.app.modelo.Cita;
import com.citaMedica.app.service.CitaMedicaService;

@Controller
//Añadir un nivel en el path -> @RequestMapping("/articulo")
public class CitaController {

	@Autowired
	private CitaMedicaService citaServ;

	@PostMapping("/submit")
	public String crearCitaDb(@ModelAttribute("cita") Cita cita,Model model) {	
		citaServ.crear(cita);
		return "redirect:/";
	}
	

	@GetMapping("/eliminarcita/{id}")
	public String borrarCitaDb(@PathVariable("id")Long id, Model model) {
		citaServ.borrar(id);
		return "redirect:/";	
	}	
	
}