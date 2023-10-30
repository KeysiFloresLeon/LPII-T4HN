package com.pspring2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControladorIndex {
	
	@GetMapping("/")
	public String mostrarIndex() {
		return "/index";
	}
}
