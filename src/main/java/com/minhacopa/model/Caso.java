package com.minhacopa.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Caso {

	@Id
	private String casoId;
	private String nu_NOTIFIC;
	private String dt_NOTIFIC;
	private Integer nu_ANO;
	private String sg_UF_NOT;    
	private String dt_DIAG;    
	private String nm_PACIENT;
	private String dt_NASC;        
	private String cs_SEXO;    
	private String nm_MAE_PAC;
	private String sg_UF;  
	private String nm_BAIRRO;
	private String nm_LOGRADO;
	private String nu_NUMERO;
	private String nm_COMPLEM;
	private String nm_REFEREN;
	private String dsmotivo;
	private String dt_DIGITA;
	private String dt_TRANSUS;
	private String dt_TRANSDM;
	private String dt_TRANSSM;
	private String dt_TRANSRM;
	private String dt_TRANSRS;
	private String dt_TRANSSE;
	private String ds_OBS;
	private String tipo;
	
	
	public String getCasoId() {
		return casoId;
	}
	public void setCasoId(String casoId) {
		this.casoId = casoId;
	}
	public String getNu_NOTIFIC() {
		return nu_NOTIFIC;
	}
	public void setNu_NOTIFIC(String nu_NOTIFIC) {
		this.nu_NOTIFIC = nu_NOTIFIC;
	}
	public String getDt_NOTIFIC() {
		return dt_NOTIFIC;
	}
	public void setDt_NOTIFIC(String dt_NOTIFIC) {
		this.dt_NOTIFIC = dt_NOTIFIC;
	}
	public Integer getNu_ANO() {
		return nu_ANO;
	}
	public void setNu_ANO(Integer nu_ANO) {
		this.nu_ANO = nu_ANO;
	}
	public String getSg_UF_NOT() {
		return sg_UF_NOT;
	}
	public void setSg_UF_NOT(String sg_UF_NOT) {
		this.sg_UF_NOT = sg_UF_NOT;
	}
	public String getDt_DIAG() {
		return dt_DIAG;
	}
	public void setDt_DIAG(String dt_DIAG) {
		this.dt_DIAG = dt_DIAG;
	}
	public String getNm_PACIENT() {
		return nm_PACIENT;
	}
	public void setNm_PACIENT(String nm_PACIENT) {
		this.nm_PACIENT = nm_PACIENT;
	}
	public String getDt_NASC() {
		return dt_NASC;
	}
	public void setDt_NASC(String dt_NASC) {
		this.dt_NASC = dt_NASC;
	}
	public String getCs_SEXO() {
		return cs_SEXO;
	}
	public void setCs_SEXO(String cs_SEXO) {
		this.cs_SEXO = cs_SEXO;
	}
	public String getNm_MAE_PAC() {
		return nm_MAE_PAC;
	}
	public void setNm_MAE_PAC(String nm_MAE_PAC) {
		this.nm_MAE_PAC = nm_MAE_PAC;
	}
	public String getSg_UF() {
		return sg_UF;
	}
	public void setSg_UF(String sg_UF) {
		this.sg_UF = sg_UF;
	}
	public String getNm_BAIRRO() {
		return nm_BAIRRO;
	}
	public void setNm_BAIRRO(String nm_BAIRRO) {
		this.nm_BAIRRO = nm_BAIRRO;
	}
	public String getNm_LOGRADO() {
		return nm_LOGRADO;
	}
	public void setNm_LOGRADO(String nm_LOGRADO) {
		this.nm_LOGRADO = nm_LOGRADO;
	}
	public String getNu_NUMERO() {
		return nu_NUMERO;
	}
	public void setNu_NUMERO(String nu_NUMERO) {
		this.nu_NUMERO = nu_NUMERO;
	}
	public String getNm_COMPLEM() {
		return nm_COMPLEM;
	}
	public void setNm_COMPLEM(String nm_COMPLEM) {
		this.nm_COMPLEM = nm_COMPLEM;
	}
	public String getNm_REFEREN() {
		return nm_REFEREN;
	}
	public void setNm_REFEREN(String nm_REFEREN) {
		this.nm_REFEREN = nm_REFEREN;
	}
	public String getDsmotivo() {
		return dsmotivo;
	}
	public void setDsmotivo(String dsmotivo) {
		this.dsmotivo = dsmotivo;
	}
	public String getDt_DIGITA() {
		return dt_DIGITA;
	}
	public void setDt_DIGITA(String dt_DIGITA) {
		this.dt_DIGITA = dt_DIGITA;
	}
	public String getDt_TRANSUS() {
		return dt_TRANSUS;
	}
	public void setDt_TRANSUS(String dt_TRANSUS) {
		this.dt_TRANSUS = dt_TRANSUS;
	}
	public String getDt_TRANSDM() {
		return dt_TRANSDM;
	}
	public void setDt_TRANSDM(String dt_TRANSDM) {
		this.dt_TRANSDM = dt_TRANSDM;
	}
	public String getDt_TRANSSM() {
		return dt_TRANSSM;
	}
	public void setDt_TRANSSM(String dt_TRANSSM) {
		this.dt_TRANSSM = dt_TRANSSM;
	}
	public String getDt_TRANSRM() {
		return dt_TRANSRM;
	}
	public void setDt_TRANSRM(String dt_TRANSRM) {
		this.dt_TRANSRM = dt_TRANSRM;
	}
	public String getDt_TRANSRS() {
		return dt_TRANSRS;
	}
	public void setDt_TRANSRS(String dt_TRANSRS) {
		this.dt_TRANSRS = dt_TRANSRS;
	}
	public String getDt_TRANSSE() {
		return dt_TRANSSE;
	}
	public void setDt_TRANSSE(String dt_TRANSSE) {
		this.dt_TRANSSE = dt_TRANSSE;
	}
	public String getDs_OBS() {
		return ds_OBS;
	}
	public void setDs_OBS(String ds_OBS) {
		this.ds_OBS = ds_OBS;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
	

}
