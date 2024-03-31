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

import br.edu.infnet.CalebeCM.model.domain.Jogador;
import br.edu.infnet.CalebeCM.model.service.JogadorService;

@RestController
@RequestMapping("/api/jogador")
public class JogadorController {
	
	@Autowired
	private JogadorService jogadorService;

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Jogador jogador) {
		jogadorService.incluir(jogador);
	}
	
	@DeleteMapping(value = "/{registro}/excluir")
	public void excluir(@PathVariable int registro) {
		jogadorService.excluir(registro);
		
	}
	@GetMapping(value = "/listar")
	public Collection<Jogador> obterLista(){
		return jogadorService.obterLista();
	}
	
	@GetMapping(value = "/{registro}/listar")
	public Jogador obter (@PathVariable int registro) {
		return jogadorService.obter(registro);
	}
}