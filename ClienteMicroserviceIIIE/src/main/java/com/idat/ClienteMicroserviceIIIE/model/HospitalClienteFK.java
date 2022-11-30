package com.idat.ClienteMicroserviceIIIE.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HospitalClienteFK  implements Serializable {

	private static final long serialVersionUID = -803354081908619193L;

	@Column(name = "ID_CLIENTE", nullable = false)
	private Integer idCliente;
	
	@Column(name = "ID_HOSPITAL", nullable = false)
	private Integer idHospital;

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public Integer getIdHospital() {
		return idHospital;
	}

	public void setIdHospital(Integer idHospital) {
		this.idHospital = idHospital;
	}
}
