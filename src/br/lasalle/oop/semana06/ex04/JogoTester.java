package br.lasalle.oop.semana06.ex04;

import java.util.Scanner;

public class JogoTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Iniciando as partidas");
		for(int i=1;i<4;i++) {
			System.out.println("Vai comecar a partida " + i);
			
			Time local = new Time();
			System.out.println("Entre com o time 1");
			local.setName(input.next());
			
			Time visit = new Time();
			System.out.println("Entre com o time 2");
			visit.setName(input.next());
			
			System.out.println("========= Preparando jogo =========\n");
			
			local.Listar();
			visit.Listar();
			
			Partida p1 = new Partida();
			p1.setTimeLocal(local);
			p1.setTimeVisitante(visit);
			
			System.out.println("Inicio de Jogo. Partida iniciada !!");
			
			p1.inciarPartida();
			
			p1.mostraResult();
			
			p1.finalizarPartida();
			
			local.Listar();
			visit.Listar();
			
			System.out.println("*********************************************");
		}
		
	}

}
