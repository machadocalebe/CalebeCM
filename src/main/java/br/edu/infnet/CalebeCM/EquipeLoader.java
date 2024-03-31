package br.edu.infnet.CalebeCM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.CalebeCM.model.domain.Endereco;
import br.edu.infnet.CalebeCM.model.domain.Equipe;
import br.edu.infnet.CalebeCM.model.service.EquipeService;
import br.edu.infnet.CalebeCM.model.service.LocalidadeService;

@Component
public class EquipeLoader implements ApplicationRunner {
	
	@Autowired
	private LocalidadeService localidadeService;
	@Autowired
	private EquipeService equipeService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		 Endereco equipeEndereco = localidadeService.obterPorCep("23520115");
		 
		 Equipe e1 = new Equipe();
		 Equipe e2 = new Equipe();
		 Equipe e3 = new Equipe();
		 
		 e1.setNome("Flamengo");
		 e2.setNome("Botafogo");
		 e3.setNome("Vasco");
		 
		 e1.setEmail("Flamengoemaneiro@mail");
		 e2.setEmail("Botafogoemtudo@mail");
		 e3.setEmail("Vasconaseriea@mail");
		 
		 e1.setEndereco(equipeEndereco);
		 e2.setEndereco(equipeEndereco);
		 e3.setEndereco(equipeEndereco);
		 
		equipeService.incluir(e1);
		equipeService.incluir(e2);
		equipeService.incluir(e3);
		
		System.out.println(" - " + equipeService.obterLista());
	}
}
