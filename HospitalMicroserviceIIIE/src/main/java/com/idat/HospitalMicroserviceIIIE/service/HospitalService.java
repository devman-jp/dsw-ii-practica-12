package com.idat.HospitalMicroserviceIIIE.service;

import com.idat.HospitalMicroserviceIIIE.dto.HospitalDTO;
import java.util.List;

public interface HospitalService {
	
	List<HospitalDTO> listar();	
	void guardar(HospitalDTO HospitalDTO);

}
