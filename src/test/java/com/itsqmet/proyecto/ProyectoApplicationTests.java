package com.itsqmet.proyecto;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.itsqmet.proyecto.modelo.Estudiante;

import com.itsqmet.proyecto.servicio.IEstudianteServicio;


@SpringBootTest
class ProyectoApplicationTests {
	
	@Autowired
	private IEstudianteServicio servicioEstudiante;

	@Test
	void contextLoads() {
		Estudiante nuevo= new Estudiante();
		nuevo.setNombre("Jairo Perez ");
		nuevo.setEdad(22);
		nuevo.setDireccion(" El recreo");
		nuevo.setCorreo("playanime96@gmail.com");
		nuevo.setTelefono("0988309055");

		
		servicioEstudiante.insertarEstudiante(nuevo);
	}
	

}
