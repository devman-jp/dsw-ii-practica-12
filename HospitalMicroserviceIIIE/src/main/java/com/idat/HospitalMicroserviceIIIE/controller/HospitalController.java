package com.idat.HospitalMicroserviceIIIE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.HospitalMicroserviceIIIE.dto.HospitalDTO;


@Controller
@RequestMapping("/api/hospital/v1")
public class HospitalController {
	
	@Autowired
	private HospitalService service;
	
	
	@GetMapping("/listar")
	public @ResponseBody List<HospitalDTO> listar(){
		return service.listar();
	}
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody HospitalDTO dto) {
		service.guardar(dto);
	}
	
}
