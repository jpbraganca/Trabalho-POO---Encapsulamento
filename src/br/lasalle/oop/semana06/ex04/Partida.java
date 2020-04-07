package br.lasalle.oop.semana06.ex04;

import java.util.Date;
import java.util.Random;


public class Partida {
	private Time timeVisitante;
	private Time timeLocal;
	private int scoreVisitante;
	private int scoreLocal;
	private Date dataPartida;
	
	Random rand = new Random();
	
	
	public Time getTimeVisitante() {
		return timeVisitante;
	}
	public void setTimeVisitante(Time timeVisitante) {
		this.timeVisitante = timeVisitante;
	}
	public Time getTimeLocal() {
		return timeLocal;
	}
	public void setTimeLocal(Time timeLocal) {
		this.timeLocal = timeLocal;
	}
	public int getScoreVisitante() {
		return scoreVisitante;
	}
	public void setScoreVisitante(int scoreVisitante) {
		this.scoreVisitante = scoreVisitante;
	}
	public int getScoreLocal() {
		return scoreLocal;
	}
	public void setScoreLocal(int scoreLocal) {
		this.scoreLocal = scoreLocal;
	}

	//Methods
	
	public void inciarPartida() {	
		setScoreVisitante(rand.nextInt(10));
		setScoreLocal(rand.nextInt(10));
	}
	public void mostraResult() {
		System.out.println(getTimeLocal().getName()+ " " + getScoreLocal() +" "+ "X" +" "+ getScoreVisitante() + " "+ getTimeVisitante().getName()+"\n");
	}
	
	public void finalizarPartida() {
		if (getScoreLocal() == getScoreVisitante()) {
			
			getTimeLocal().setQtdPontos(+1);
			getTimeLocal().setQtdEmpate(+1);
			
			getTimeVisitante().setQtdPontos(+1);
			getTimeVisitante().setQtdEmpate(+1);
		}
		else if(getScoreLocal() > getScoreVisitante()) {
			getTimeLocal().setQtdPontos(+3);
			getTimeLocal().setQtdVitorias(+1);
			
			getTimeVisitante().setQtdDerrotas(+1);
		}
		else {
			getTimeVisitante().setQtdPontos(+3);
			getTimeVisitante().setQtdVitorias(+1);
			
			getTimeLocal().setQtdDerrotas(+1);
		}
	}
	
}
