package com.itsqmet.proyecto.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MatriculaControlador {
@GetMapping("/Matricula")
public String paginaMatriculas() {
	return "/Matricula/listarMatricula";
}
}
