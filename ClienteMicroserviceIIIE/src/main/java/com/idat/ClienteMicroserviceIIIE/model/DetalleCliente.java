package com.idat.ClienteMicroserviceIIIE.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DETALLE_CLIENTE")
public class DetalleCliente {

	@Id
	private HospitalClienteFK fk = new HospitalClienteFK();

	public HospitalClienteFK getFk() {
		return fk;
	}

	public void setFk(HospitalClienteFK fk) {
		this.fk = fk;
	}
	
	
	
}
