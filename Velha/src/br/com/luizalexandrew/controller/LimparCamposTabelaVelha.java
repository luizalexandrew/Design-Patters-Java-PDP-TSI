package br.com.luizalexandrew.controller;

import br.com.luizalexandrew.model.Campo;
import br.com.luizalexandrew.model.Tabela;

public class LimparCamposTabelaVelha {
	
	public static Tabela limpar(Tabela tabela){
		
		Campo campos[][] = tabela.getTabela();
		int tamanho = tabela.getTamanho();
		
		for(int i = 0; i<tamanho;i++)
			for(int y =0; y<tamanho;y++)
				campos[i][y].init();
			
		tabela.setVencedor(false);
		tabela.setCampos(campos);
		return tabela;
		
	}
}
