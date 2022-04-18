package com.ProjetoIntegrador.SiteKaue.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Golpe implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private int startup;
	private int ativas;
	private int recuperacao;
	private int vantagemAcerto;
	private int vantagemBloqueio;
	private boolean positivo;
	private boolean negativo;;
	private boolean superCancel;
	private boolean specialCancel;

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

	public int getStartup() {
		return startup;
	}

	public void setStartup(int startup) {
		this.startup = startup;
	}

	public int getAtivas() {
		return ativas;
	}

	public void setAtivas(int ativas) {
		this.ativas = ativas;
	}

	public int getRecuperacao() {
		return recuperacao;
	}

	public void setRecuperacao(int recuperacao) {
		this.recuperacao = recuperacao;
	}

	public int getVantagemAcerto() {
		return vantagemAcerto;
	}

	public void setVantagemAcerto(int vantagemAcerto) {
		this.vantagemAcerto = vantagemAcerto;
	}

	public int getVantagemBloqueio() {
		return vantagemBloqueio;
	}

	public void setVantagemBloqueio(int vantagemBloqueio) {
		this.vantagemBloqueio = vantagemBloqueio;
	}

	public boolean isPositivo() {
		return positivo;
	}

	public void setPositivo(boolean positivo) {
		this.positivo = positivo;
	}

	public boolean isNegativo() {
		return negativo;
	}

	public void setNegativo(boolean negativo) {
		this.negativo = negativo;
	}

	public boolean isSuperCancel() {
		return superCancel;
	}

	public void setSuperCancel(boolean superCancel) {
		this.superCancel = superCancel;
	}

	public boolean isSpecialCancel() {
		return specialCancel;
	}

	public void setSpecialCancel(boolean specialCancel) {
		this.specialCancel = specialCancel;
	}	

}
