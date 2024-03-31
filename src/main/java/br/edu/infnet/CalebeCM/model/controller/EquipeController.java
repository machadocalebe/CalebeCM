package br.edu.infnet.CalebeCM.model.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.infnet.CalebeCM.model.domain.Equipe;
import br.edu.infnet.CalebeCM.model.service.EquipeService;

@RestController
@RequestMapping("/api/equipe")
public class EquipeController {
	
	@Autowired
	private EquipeService equipeService;

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Equipe equipe) {
		equipeService.incluir(equipe);
	}
	
	@DeleteMapping(value = "/{nome}/excluir")
	public void excluir(@PathVariable String nome) {
		equipeService.excluir(nome);
		
	}
	
	@GetMapping(value = "/listar")
	public Collection<Equipe> obterLista(){
		return equipeService.obterLista();
	}
	
	@GetMapping(value = "/{nome}/listar")
	public Equipe obter (@PathVariable String nome) {
		return equipeService.obter(nome);
	}
}