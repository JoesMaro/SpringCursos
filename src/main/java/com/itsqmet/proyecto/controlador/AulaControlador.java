package com.itsqmet.proyecto.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AulaControlador {
@GetMapping("/Aula")
public String paginaAulas() {
	return"/Aula/listarAula";
}
}
