package br.edu.infnet.CalebeCM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.CalebeCM.model.domain.Jogador;
import br.edu.infnet.CalebeCM.model.service.EquipeService;
import br.edu.infnet.CalebeCM.model.service.JogadorService;


@Component
public class JogadorLoader implements ApplicationRunner {
	
	@Autowired
	private JogadorService jogadorService;
	@Autowired
	private EquipeService equipeService;
	@Override
	public void run(ApplicationArguments args) throws Exception {

		Jogador t1 = new Jogador();
		Jogador t2 = new Jogador();
		
		t1.setRegistro(1);
		t1.setNome("Gabigol");
		t2.setRegistro(2);
		t2.setNome("Arrascaeta");
		
		t1.setEquipe(equipeService.obter("Flamengo"));
		t2.setEquipe(equipeService.obter("Flamengo"));
		
		jogadorService.incluir(t1);
		jogadorService.incluir(t2);
		
		System.out.println(jogadorService.obterLista());
		
	}
	

	
}

