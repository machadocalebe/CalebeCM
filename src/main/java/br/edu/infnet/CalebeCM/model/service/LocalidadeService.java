package br.edu.infnet.CalebeCM.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.infnet.CalebeCM.clients.IEnderecoClient;
import br.edu.infnet.CalebeCM.model.domain.Endereco;


@Service
public class LocalidadeService {
	
	@Autowired 
	private IEnderecoClient enderecoClient;
	
	public Endereco obterPorCep(String cep) {
		return enderecoClient.obterPorCep(cep);
	}
}
 