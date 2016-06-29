package br.com.luizalexandrew.model;

public interface Validador {

	public boolean validar(Tabela tabela, Jogador player);
	
	public boolean validarLinhas(Tabela tabela, Jogador player);
	
	public boolean validarColunas(Tabela tabela, Jogador player);
	
	public boolean validarDiagonalEsquerda(Tabela tabela, Jogador player);
	
	public boolean validarDiagonalDireita(Tabela tabela, Jogador player);
}
