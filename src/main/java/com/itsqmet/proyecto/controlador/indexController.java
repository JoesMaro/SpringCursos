package com.itsqmet.proyecto.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {
	@GetMapping("/inicio")
	
	public String paginainicio() {
		return"index";
	}

}
