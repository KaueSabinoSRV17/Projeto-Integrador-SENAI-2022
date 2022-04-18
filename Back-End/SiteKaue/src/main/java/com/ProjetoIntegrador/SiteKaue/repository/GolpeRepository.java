package com.ProjetoIntegrador.SiteKaue.repository;

import org.springframework.data.repository.CrudRepository;

import com.ProjetoIntegrador.SiteKaue.models.Golpe;

public interface GolpeRepository extends CrudRepository<Golpe, Long>{
	
	Golpe findById (long id);

}
