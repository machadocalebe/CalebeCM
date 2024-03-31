package br.edu.infnet.CalebeCM.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.CalebeCM.model.domain.Equipe;


@Service
public class EquipeService {
	
	private static Map<String, Equipe> equipes = new HashMap<String, Equipe>();
	
	public void incluir(Equipe equipe) {
		equipes.put(equipe.getNome(), equipe);
	}
	
	public void excluir(String nome) {
		equipes.remove(nome);
	}
	
	public Collection<Equipe> obterLista() {
		return equipes.values();
	}
	
	public Equipe obter(String nome){
		return equipes.get(nome);
	}
}
