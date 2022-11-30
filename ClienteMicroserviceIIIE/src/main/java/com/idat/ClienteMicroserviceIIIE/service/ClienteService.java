package com.idat.ClienteMicroserviceIIIE.service;

import com.idat.ClienteMicroserviceIIIE.model.Cliente;

public interface ClienteService {

	void create(Cliente cliente);
	
	void assignHospitalCliente(Cliente cliente);
	
}
