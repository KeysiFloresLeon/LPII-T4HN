package com.pspring1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorMensaje {
	@GetMapping("/")
	public String mensaje() {
		return "Examen de Laboratorio 2 - Keysi Pamela Flores León";
	}
}

