package br.com.luizalexandrew.model;

public class ValidadorVelha implements Validador {
	
	private final int tamanho = 3;

	@Override
	public boolean validarAll(Tabela tabela, Jogador player) {
		
		if(validarLinhas(tabela, player))
			return true;
		if(validarColunas(tabela, player))
			return true;
		if(validarDiagonais(tabela, player))
			return true;	
		return false;
		
	}

	@Override
	public boolean validarLinhas(Tabela tabela, Jogador player) {
		
		Campo campos[][] = tabela.getTabela();
		
		for(int i=0;i < tamanho; i++){
			if(campos[i][0].getValue() == player.getMarca() && campos[i][1].getValue() == player.getMarca() && campos[i][2].getValue() == player.getMarca()){
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean validarColunas(Tabela tabela, Jogador player) {
		
		Campo campos[][] = tabela.getTabela();
		
		for(int i=0;i < tamanho; i++){
			if(campos[0][i].getValue() == player.getMarca() && campos[1][i].getValue() == player.getMarca() && campos[2][i].getValue() == player.getMarca()){
				return true;
			}
		}
		
		return false;
	}

	@Override
	public boolean validarDiagonais(Tabela tabela, Jogador player) {
		
		Campo campos[][] = tabela.getTabela();
		
		if(campos[0][0].getValue() == player.getMarca() && campos[1][1].getValue() == player.getMarca() && campos[2][2].getValue() == player.getMarca()){
			return true;
		}
		
		if(campos[0][2].getValue() == player.getMarca() && campos[1][1].getValue() == player.getMarca() && campos[2][0].getValue() == player.getMarca()){
			return true;
		}		
		return false;
	}	
	
}
