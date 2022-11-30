package com.idat.ClienteMicroserviceIIIE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.ClienteMicroserviceIIIE.client.OpenFeignClient;
import com.idat.ClienteMicroserviceIIIE.dto.HospitalDTO;
import com.idat.ClienteMicroserviceIIIE.model.Cliente;
import com.idat.ClienteMicroserviceIIIE.model.DetalleCliente;
import com.idat.ClienteMicroserviceIIIE.model.HospitalClienteFK;
import com.idat.ClienteMicroserviceIIIE.repository.ClienteRepository;
import com.idat.ClienteMicroserviceIIIE.repository.DetalleClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	private ClienteRepository clienteRepo;
	
	@Autowired
	private DetalleClienteRepository detalleRepo;
	
	@Autowired
	private OpenFeignClient client;
	
	@Override
	public void create(Cliente cliente) {
		clienteRepo.save(cliente);
	}

	@Override
	public void assignHospitalCliente(Cliente cliente) {
		List<HospitalDTO> listado = client.listaHospital();
		
		HospitalClienteFK fk = null;
		
		DetalleCliente detalle = null;
		
		for (HospitalDTO hospitalDTO : listado) {
			fk = new HospitalClienteFK();
			
			fk.setIdCliente(cliente.getIdCliente());
			fk.setIdHospital(hospitalDTO.getCod());
			
			detalle = new DetalleCliente();
			detalle.setFk(fk);
			
			detalleRepo.save(detalle);
		}
	}

}
