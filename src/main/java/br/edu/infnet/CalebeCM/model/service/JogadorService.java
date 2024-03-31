package br.edu.infnet.CalebeCM.model.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.edu.infnet.CalebeCM.model.domain.Jogador;

@Service
public class JogadorService {
	
	private static Map<Integer, Jogador> jogadores = new HashMap<Integer, Jogador>();
	
	
	public void incluir(Jogador jogador) {
		jogadores.put(jogador.getRegistro(), jogador);
	}
	
	public void excluir(int registro) {
		jogadores.remove(registro);
	}
	
	public Collection<Jogador> obterLista(){
		return jogadores.values();
	}
	
	public Jogador obter (int registro) {
		return jogadores.get(registro);
	}
}
