package br.edu.infnet.CalebeCM.model.domain;

public class Jogador {

	private int registro;
	private String nome;
	private float salario;
	private boolean exCampeao;
	private Equipe equipe;
	
	
	public Jogador() {
		this.nome = null;
		this.salario = 0;
		this.exCampeao = false;
		this.equipe = null;
		
	}
	
	public Jogador(int registro, String nome) {
		this();
		this.registro = registro;
		this.nome = nome;
	}
	
	public Jogador(int registro, String nome, Equipe equipe) {
		this();
		this.registro = registro;
		this.nome = nome;
		this.equipe = equipe;
	}
	
	@Override
	public String toString() {
		return "Treinador: " + nome;
	}
	
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public boolean isExCampeao() {
		return exCampeao;
	}
	public void setExCampeao(boolean exCampeao) {
		this.exCampeao = exCampeao;
	}
	
	public Equipe getEquipe() {
		return equipe;
	}

	public void setEquipe(Equipe equipe) {
		this.equipe = equipe;
	}

}
