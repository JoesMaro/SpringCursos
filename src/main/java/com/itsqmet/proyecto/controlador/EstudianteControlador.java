package com.itsqmet.proyecto.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EstudianteControlador {
@GetMapping("/Estudiante")
public String paginaEstudiantes() {
	return "/Estudiante/listarEstudiante";
}
}
