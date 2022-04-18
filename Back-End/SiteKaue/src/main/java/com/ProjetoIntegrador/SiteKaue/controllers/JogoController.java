package com.ProjetoIntegrador.SiteKaue.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.ProjetoIntegrador.SiteKaue.models.Jogo;
import com.ProjetoIntegrador.SiteKaue.repository.JogoRepository;
import com.ProjetoIntegrador.SiteKaue.models.Personagem;
import com.ProjetoIntegrador.SiteKaue.repository.PersonagemRepository;

@Controller
public class JogoController {
	
	@Autowired
	JogoRepository jr;
	
	@Autowired
	PersonagemRepository pr;
	
	@RequestMapping("/cadastrarJogo")
	public String getForm () {
		
		return "jogo/form-jogo";
		
	}
	
	@RequestMapping(value = "/cadastrarJogo", method = RequestMethod.POST)
	public String postForm (Jogo jogo, BindingResult result, RedirectAttributes attributes) {
		
		if (result.hasErrors()) {
			
			attributes.addFlashAttribute("mensagem", "Campos preenchidos de maneira incorreta");
			return "redirect:/cadastrarJogo";
			
		}
		
		jr.save(jogo);
		attributes.addFlashAttribute("mensagem", "Novo Jogo adicionado com sucesso");
		return "redirect:/jogos";
		
	}
	
	@RequestMapping("/jogos")
	public ModelAndView listaJogo() {
		
		ModelAndView mv = new ModelAndView("jogo/lista-jogo");
		Iterable<Jogo> jogos = jr.findAll();
		mv.addObject("jogos", jogos);
		return mv;
		
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView personagemJogo(@PathVariable("id") long id) {
		Jogo jogo = jr.findById(id);
		ModelAndView mv = new ModelAndView("jogo/personagem-jogo");
		mv.addObject("jogo", jogo);

		Iterable<Personagem> personagens = pr.findByJogo(jogo);
		mv.addObject("personagens", personagens);

		return mv;

	}
	
	@RequestMapping("/deletaJogo")
	public String deletaJogo(long id) {
		
		Jogo jogo = jr.findById(id);
		jr.delete(jogo);
		return "redirect:/jogos";
		
	}
	
	@RequestMapping("/atualizaJogo")
	public ModelAndView atualizaJogo(long id) {
		
		Jogo jogo = jr.findById(id);
		ModelAndView mv = new ModelAndView("jogo/update-jogo");
		mv.addObject("jogo", jogo);
		return mv;
		
	}
	
	@RequestMapping(value = "/atualizaJogo", method = RequestMethod.POST)
	public String postAtualiza(Jogo jogo, BindingResult result, RedirectAttributes attributes) {
		
		jr.save(jogo);
		attributes.addFlashAttribute("mensagem", "Jogo alterado com sucesso!");
		return "redirect:/jogos";
		
	}

}