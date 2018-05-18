package com.minhacopa.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Caso {

	@Id
	private String casoId;

	private Integer idUnidade;
	private Integer idPessoa;
	private String unidade;
	private String bairro;
	private String sexo;
	private String dataRegistro;
	private String dataTransmicao;
	private String doenca;
	
	
	public String getCasoId() {
		return casoId;
	}
	public void setCasoId(String casoId) {
		this.casoId = casoId;
	}
	public Integer getIdUnidade() {
		return idUnidade;
	}
	public void setIdUnidade(Integer idUnidade) {
		this.idUnidade = idUnidade;
	}
	public Integer getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getUnidade() {
		return unidade;
	}
	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(String dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public String getDataTransmicao() {
		return dataTransmicao;
	}
	public void setDataTransmicao(String dataTransmicao) {
		this.dataTransmicao = dataTransmicao;
	}
	public String getDoenca() {
		return doenca;
	}
	public void setDoenca(String doenca) {
		this.doenca = doenca;
	}	
	
	

		


	
	

}
