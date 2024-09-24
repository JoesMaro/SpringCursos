package com.itsqmet.proyecto.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
@Data
@Entity
@Table(name="Estudiante")
public class Estudiante implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idEstudiante;
	private String Nombre;
	private String Direccion;
	private String Telefono;
	private String Correo;
	private int Edad;
	
	//Relacion para un estudiante a varias 
	//matriculas
	
	@OneToMany(mappedBy = "fkMatricula")
	private List<Matricula> listaMatricula= new ArrayList<>();
}
