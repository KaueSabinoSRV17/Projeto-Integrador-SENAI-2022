package com.ProjetoIntegrador.SiteKaue.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
public class Evento implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private String dataCriacao;
	private String dataUltimaEdicao;
	private String dataProximaEdicao;
	private boolean daPontos;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public String getDataUltimaEdicao() {
		return dataUltimaEdicao;
	}
	public void setDataUltimaEdicao(String dataUltimaEdicao) {
		this.dataUltimaEdicao = dataUltimaEdicao;
	}
	public String getDataProximaEdicao() {
		return dataProximaEdicao;
	}
	public void setDataProximaEdicao(String dataProximaEdicao) {
		this.dataProximaEdicao = dataProximaEdicao;
	}
	public boolean isDaPontos() {
		return daPontos;
	}
	public void setDaPontos(boolean daPontos) {
		this.daPontos = daPontos;
	}

}
