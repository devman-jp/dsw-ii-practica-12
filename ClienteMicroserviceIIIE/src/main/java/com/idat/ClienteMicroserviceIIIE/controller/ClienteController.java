package com.idat.ClienteMicroserviceIIIE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.ClienteMicroserviceIIIE.model.Cliente;
import com.idat.ClienteMicroserviceIIIE.service.ClienteService;

@Controller
@RequestMapping("/api/v1/cliente")
public class ClienteController {

	@Autowired
	private ClienteService clienteService;
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Cliente cliente) {
		clienteService.create(cliente);
	}
	
	@PostMapping("/asignar")
	public @ResponseBody void asignarHospitalCliente(Cliente cliente) {
		clienteService.assignHospitalCliente(cliente);
	}
	
}
