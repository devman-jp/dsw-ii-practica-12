package com.idat.ClienteMicroserviceIIIE.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.idat.ClienteMicroserviceIIIE.dto.HospitalDTO;


@FeignClient(name = "hospital-microservice", url = "localhost:8080")
public interface OpenFeignClient {

	@GetMapping("/api/v1/hospital/listar")
	public List<HospitalDTO> listaHospital();
	
}
