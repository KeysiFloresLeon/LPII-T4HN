package com.pspring5;

import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pspring5.alumno.Estudiante;

@Controller
public class ControladorEstudiante {
	@GetMapping("/estudiantes/lista")
	public String listar(Model estudiante) {
		
		var estudiante1 = new Estudiante();
		estudiante1.setCodigo("Alum001");
		estudiante1.setNombre("Carlos");
		estudiante1.setCurso("LP II");
		estudiante1.setExamenparcial(18);
	
		var estudiante2 = new Estudiante();
		estudiante2.setCodigo("Alum002");
		estudiante2.setNombre("Karla");
		estudiante2.setCurso("LP I");
		estudiante2.setExamenparcial(15);
		
		var estudiante3 = new Estudiante();
		estudiante3.setCodigo("Alum003");
		estudiante3.setNombre("Miguel");
		estudiante3.setCurso("POO");
		estudiante3.setExamenparcial(20);
		
		var estudiantes = Arrays.asList(estudiante1, estudiante2, estudiante3);
		
		estudiante.addAttribute("estudiante", estudiantes);
		
		return "estudianteIndex";
	}
}
