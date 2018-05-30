package com.minhacopa.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Warning {
	@Id
	private String warningId;
	private Integer casos;
	private Date data;
	

	public String getWarningId() {
		return warningId;
	}

	public void setWarningId(String warningId) {
		this.warningId = warningId;
	}

	public Integer getCasos() {
		return casos;
	}

	public void setCasos(Integer casos) {
		this.casos = casos;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}


	
}
