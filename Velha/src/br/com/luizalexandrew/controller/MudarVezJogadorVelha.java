package br.com.luizalexandrew.controller;

import br.com.luizalexandrew.model.Jogador;

public class MudarVezJogadorVelha {
	
	public static Jogador mudar(Jogador jogador, Jogador player1, Jogador player2){
		
		if(jogador == player1){
			jogador = player2;
		}else{
			jogador = player1;
		}		
		return jogador;
		
	}
	
}
