package br.edu.infnet.CalebeCM.model.domain;

import java.util.List;

public class Equipe {
	private String nome;
	private String email;
	private List<Jogador> treinadores;
	private Endereco endereco;
	
	public Equipe() {
		
	}
	
	public Equipe(String nome) {
		this();
		this.setNome(nome);
	}
	
	public Equipe(String nome, String email) {
		this(nome);
		this.setEmail(email);
	}
	
	public Equipe(String nome, String email, Endereco endereco) {
		this(nome, email);
		this.setEndereco(endereco);
	}
	
	@Override
	public String toString() {
		return "Equipe: " + nome + " - " + email + " - " + endereco;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<Jogador> getTreinadores() {
		return treinadores;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTreinadores(List<Jogador> treinadores) {
		this.treinadores = treinadores;
	}
}

