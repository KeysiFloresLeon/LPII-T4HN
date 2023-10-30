package com.pspring3;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorSaludo {
	
	@GetMapping("/saludo")
	public String saludo(Model model) {
		var mensaje = "Bienvenido al mundo Spring con Java";
		model.addAttribute("mensaje", mensaje);
		return "saludoIndex";
	}
}
