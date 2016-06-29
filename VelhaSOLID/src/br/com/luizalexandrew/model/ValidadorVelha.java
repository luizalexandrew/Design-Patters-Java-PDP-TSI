package br.com.luizalexandrew.model;

public class ValidadorVelha implements Validador {
	
	private int tamanho;

	@Override
	public boolean validar(Tabela tabela, Jogador player) {
		
		tamanho = tabela.getTamanho();
		
		if(validarLinhas(tabela, player))
			return true;
		if(validarColunas(tabela, player))
			return true;
		if(validarDiagonalEsquerda(tabela, player))
			return true;
		if(validarDiagonalDireita(tabela, player))
			return true;
		return false;
		
	}

	@Override
	public boolean validarLinhas(Tabela tabela, Jogador player) {
		
		Campo campos[][] = tabela.getTabela();
		boolean resultado = false;
		
		for(int i=0;i < tamanho; i++){
			for(int y=0;y < tamanho; y++){				
				if(campos[i][y].getValue() != player.getMarca()){
					resultado = false;
					break;
				}
				resultado = true;
			}
				
			if(resultado)
				return resultado;		
		}
		
		return resultado;
	}

	@Override
	public boolean validarColunas(Tabela tabela, Jogador player) {
		
		Campo campos[][] = tabela.getTabela();
		boolean resultado = false;
		
		for(int i=0;i < tamanho; i++){
			for(int y=0;y < tamanho; y++){				
				if(campos[y][i].getValue() != player.getMarca()){
					resultado = false;
					break;
				}
				resultado = true;
			}
				
			if(resultado)
				return resultado;		
		}
		
		return resultado;
	}

	@Override
	public boolean validarDiagonalEsquerda(Tabela tabela, Jogador player) {
		
		Campo campos[][] = tabela.getTabela();
		
		for(int i=0;i < tamanho; i++){			
			if(campos[i][i].getValue() != player.getMarca()){
				return false;
			}			
		}
		
		return true;
	}
	
	@Override
	public boolean validarDiagonalDireita(Tabela tabela, Jogador player) {
		
		Campo campos[][] = tabela.getTabela();
		
		for(int i=0, y = tamanho-1 ;i < tamanho; i++, y--){
			if(campos[i][y].getValue() != player.getMarca()){
				return false;
			}
		}
			
		return true;
	}
	
}
