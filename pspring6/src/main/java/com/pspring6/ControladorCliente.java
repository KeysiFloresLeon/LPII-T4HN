package com.pspring6;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pspring6.cliente.Cliente;

@Controller
@RequestMapping("/cliente")
public class ControladorCliente {
	
	@GetMapping("/contacto")
    public String mostrarFormularioContacto(Model model) {
        model.addAttribute("cliente", new Cliente());
        return "clienteIndex";
    }
	
	@PostMapping("/contacto")
    public String procesarFormularioContacto(@ModelAttribute Cliente cliente, Model model) {
		List<Cliente> clientes = new ArrayList<>();
        clientes.add(cliente);
        model.addAttribute("clientes", clientes);
        return "clienteResultado";
    }
}
