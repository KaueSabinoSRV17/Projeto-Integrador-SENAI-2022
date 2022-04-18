package com.ProjetoIntegrador.SiteKaue.repository;

import org.springframework.data.repository.CrudRepository;

import com.ProjetoIntegrador.SiteKaue.models.Personagem;
import com.ProjetoIntegrador.SiteKaue.models.Jogo;

public interface PersonagemRepository extends CrudRepository<Personagem, Long>{
	
	Personagem findById (long id);
	Iterable<Personagem> findByJogo (Jogo jogo);

}
