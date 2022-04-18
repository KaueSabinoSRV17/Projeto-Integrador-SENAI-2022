package com.ProjetoIntegrador.SiteKaue.repository;

import org.springframework.data.repository.CrudRepository;

import com.ProjetoIntegrador.SiteKaue.models.Evento;

public interface EventoRepository extends CrudRepository<Evento, Long>{
	
	Evento findById (long id);

}
