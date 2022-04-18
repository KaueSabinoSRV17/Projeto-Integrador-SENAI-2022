package com.ProjetoIntegrador.SiteKaue.repository;

import org.springframework.data.repository.CrudRepository;

import com.ProjetoIntegrador.SiteKaue.models.Jogo;

public interface JogoRepository extends CrudRepository<Jogo, Long>{
	
	Jogo findById (long id);

}
