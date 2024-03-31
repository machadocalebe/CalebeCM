package br.edu.infnet.CalebeCM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.CalebeCM.model.domain.Endereco;
import br.edu.infnet.CalebeCM.model.service.EnderecoService;
import br.edu.infnet.CalebeCM.model.service.LocalidadeService;

// Esse é arquivo é parte da camada Loader, que roda junto da main. 

@Component
public class EnderecoLoader implements ApplicationRunner {

	@Autowired
	private LocalidadeService localidadeService;
	@Autowired
	private EnderecoService enderecoService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Endereco enderecoEquipe = localidadeService.obterPorCep("22241900");
		
		enderecoService.incluir(enderecoEquipe);
		
		enderecoService.excluir("22241900");
		
		Endereco e1 = new Endereco();
		e1.setCep("123456789");
		e1.setLogradouro("logradouro");
		e1.setBairro("bairro");
		
		enderecoService.incluir(e1);
		
		System.out.println(" - " + enderecoService.obter("123456789"));
		
		enderecoService.incluir(enderecoEquipe);
		
		System.out.println(" - " + enderecoService.obterLista());
		
		// Essa loader serve unicamente para realizar alguns testes
	}
}