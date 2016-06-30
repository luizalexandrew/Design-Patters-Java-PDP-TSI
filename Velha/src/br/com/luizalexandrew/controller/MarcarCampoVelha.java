package br.com.luizalexandrew.controller;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import br.com.luizalexandrew.view.JanelaVelha;

public class MarcarCampoVelha {
	
	public static void marcar(ActionEvent evt, JanelaVelha janela){
		
		String evento = evt.toString();
    	String n = evt.toString().substring(evento.indexOf("{") + 1, evento.indexOf("}"));
    	int x = Integer.parseInt(n.substring(0, 1));
    	int y = Integer.parseInt(n.substring(2, 3));
    	
    	if(janela.getTabela().isVencedor() == false && janela.getTabela().setInTabela(janela.getJogador(), x, y)){
    		JButton[][] botoes = janela.getBotoes();
    		botoes[x][y].setText(janela.getJogador().getMarca().toString());
    		if(janela.getValidador().validar(janela.getTabela(), janela.getJogador())){ 
    			janela.getTabela().setVencedor(true);;
    			janela.getLabel().setText("Jogador ( " + janela.getJogador().getMarca() + " ) Venceu ");
    		}
    		
    		janela.setJogador(MudarVezJogadorVelha.mudar(janela.getJogador(), janela.getPlayer1(), janela.getPlayer2()));
    		    		
    	}
    	
	}
	
}
