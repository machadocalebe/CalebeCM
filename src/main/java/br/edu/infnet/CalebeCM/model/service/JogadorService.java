package br.edu.infnet.CalebeCM.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.CalebeCM.model.domain.Jogador;

@Service
public class JogadorService {
	
	private static Map<Integer, Jogador> treinadores = new HashMap<Integer, Jogador>();
	
	
	public void incluir(Jogador jogador) {
		treinadores.put(jogador.getRegistro(), jogador);
	}
	
	public void excluir(int registro) {
		treinadores.remove(registro);
	}
	
	public Collection<Jogador> obterLista(){
		return treinadores.values();
	}
	
	public Jogador obter (int registro) {
		return treinadores.get(registro);
	}
}