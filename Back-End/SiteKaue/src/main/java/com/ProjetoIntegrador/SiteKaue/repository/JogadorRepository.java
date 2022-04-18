package com.ProjetoIntegrador.SiteKaue.repository;

import org.springframework.data.repository.CrudRepository;

import com.ProjetoIntegrador.SiteKaue.models.Jogador;

public interface JogadorRepository extends CrudRepository<Jogador, Long>{
	
	Jogador findById (long id);

}
