package com.itsqmet.proyecto.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfesorControlador {
@GetMapping("/Profesor")
public String paginaProfesor() {
	return"/Profesor/listarProfesor";
}
}
