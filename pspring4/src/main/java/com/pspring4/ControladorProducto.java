package com.pspring4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pspring4.producto.Producto;

@Controller
public class ControladorProducto {
	
	@GetMapping("/producto/único")
	public String productoUnico(Model producto) {
		
		var productoUnico = new Producto();
		productoUnico.setCodigo("P001");
		productoUnico.setNombre("Arroz");
		productoUnico.setPrecio(150.00);
		productoUnico.setCantidad(1500);
		
		producto.addAttribute("producto", productoUnico);
		
		return "productoIndex";
	}
}
