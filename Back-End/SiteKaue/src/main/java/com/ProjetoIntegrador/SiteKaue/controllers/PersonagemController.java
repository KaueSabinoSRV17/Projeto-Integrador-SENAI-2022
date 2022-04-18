package com.ProjetoIntegrador.SiteKaue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ProjetoIntegrador.SiteKaue.models.Personagem;
import com.ProjetoIntegrador.SiteKaue.repository.PersonagemRepository;

@Controller
public class PersonagemController {
	
	@Autowired
	PersonagemRepository pr;
	
	@RequestMapping("/cadastrarPersonagem")
	public String getForm() {
		
		return "personagem/form-personagem";
		
	}

}
