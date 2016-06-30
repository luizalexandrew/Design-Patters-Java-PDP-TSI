package br.com.luizalexandrew.controller;

import javax.swing.JButton;

import br.com.luizalexandrew.view.JanelaVelha;

public class LimparJanelaVelha {
	
	public static void limpar(JanelaVelha janela){
		
		int tamanho = janela.getTamanho();
		JButton botoes[][] = janela.getBotoes();
		janela.getLabel().setText(" ");
	
		for(int i = 0; i < tamanho;i++){
			for(int y = 0; y < tamanho;y++){
				botoes[i][y].setText("  ");
			}
		}
		
	}
	
}
