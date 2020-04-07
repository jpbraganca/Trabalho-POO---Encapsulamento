package br.lasalle.oop.semana06.ex04;

public class Time {
	private String name;
	private int qtdVitorias;
	private int qtdEmpate;
	private int qtdDerrotas;
	private int qtdPontos;
	
	//GETTERS & SETTERS
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQtdVitorias() {
		return qtdVitorias;
	}
	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}
	public int getQtdEmpate() {
		return qtdEmpate;
	}
	public void setQtdEmpate(int qtdEmpate) {
		this.qtdEmpate = qtdEmpate;
	}
	public int getQtdDerrotas() {
		return qtdDerrotas;
	}
	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = qtdDerrotas;
	}
	public int getQtdPontos() {
		return qtdPontos;
	}
	public void setQtdPontos(int qtdPontos) {
		this.qtdPontos = qtdPontos;
	}
	
	public void Listar() {
		System.out.println("Nome: "+ this.getName() + "\n"+
							"Vitorias: "+ this.getQtdVitorias() + "\n"+ 
							"Empates: "+ this.getQtdEmpate() + "\n"+
							"Derrotas: "+ this.getQtdDerrotas()+ "\n"+
							"Pontos: "+ this.getQtdPontos() + "\n");
	}
	
}
