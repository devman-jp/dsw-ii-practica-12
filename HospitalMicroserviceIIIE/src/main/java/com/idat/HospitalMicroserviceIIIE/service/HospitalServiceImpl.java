package com.idat.HospitalMicroserviceIIIE.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.HospitalMicroserviceIIIE.dto.HospitalDTO;
import com.idat.HospitalMicroserviceIIIE.model.Hospital;
import com.idat.HospitalMicroserviceIIIE.repository.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService {
	

	@Autowired
	private HospitalRepository hospitalRepository;
	
	@Override
	public List<HospitalDTO> listar() {
		
		List<HospitalDTO> listadto = new ArrayList();
		HospitalDTO dto = null;
		
		for (Hospital hospital : hospitalRepository.findAll()) {
			dto = new HospitalDTO();
			dto.setCod(hospital.getIdHospital());
			dto.setNom(hospital.getNombre());
			dto.setPre(hospital.getPresupuesto());
			listadto.add(dto);
			
		}
		return listadto;
	}
	
	@Override
	public void guardar(HospitalDTO hospitalDTO) {
		
		Hospital hospital = new Hospital();
		hospital.setIdHospital(hospitalDTO.getCod());
		hospital.setNombre(hospitalDTO.getNom());
		hospital.setPresupuesto(hospitalDTO.getPre());
		
		hospitalRepository.save(hospital);	
	}
}
