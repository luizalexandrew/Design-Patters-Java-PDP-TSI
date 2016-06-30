package br.com.luizalexandrew.controller;

import br.com.luizalexandrew.model.Campo;
import br.com.luizalexandrew.model.CampoVelha;
import br.com.luizalexandrew.model.Jogador;
import br.com.luizalexandrew.model.JogadorVelha;
import br.com.luizalexandrew.model.Tabela;
import br.com.luizalexandrew.model.TabelaVelha;
import br.com.luizalexandrew.model.Validador;
import br.com.luizalexandrew.model.ValidadorVelha;
import br.com.luizalexandrew.view.JanelaVelha;

public class Main {

	public static void main(String[] args) {
		
		Campo campo = new CampoVelha();
		Tabela tabela = new TabelaVelha(campo);				
		Jogador player1 = new JogadorVelha('X');
		Jogador player2 = new JogadorVelha('O');		
		Validador validador = new ValidadorVelha();	
		
		JanelaVelha janela = new JanelaVelha(tabela, player1, player2, validador);
		janela.abrir();	

	}
}
