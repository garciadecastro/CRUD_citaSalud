package com.citaMedica.app.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.citaMedica.app.modelo.Cita;
import com.citaMedica.app.service.CitaMedicaService;



@Controller
public class MainController {
	
	@Autowired
	private CitaMedicaService citaServ;
	
	@GetMapping("/")
	public String index(Model model) {
		List<Cita> listaCitas = citaServ.findAll();
		model.addAttribute("listacitas", listaCitas);
		return "index";
	}
	
	@GetMapping("/nuevacita")
	public String crearCita(Model model) {
		model.addAttribute("cita", new Cita());	
		return "nuevacita";
	}
	
	@GetMapping("/eliminarcita")
	public String borrarCita(Model model) {
		List<Cita> listaCitas = citaServ.findAll();
		Cita cita = new Cita();
		model.addAttribute("listacitas", listaCitas);
		model.addAttribute("cita", cita);
		return "eliminarcita";
	}
	

}
