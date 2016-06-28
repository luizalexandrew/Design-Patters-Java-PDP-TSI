package br.com.luizalexandrew.model;

public interface Validador {

	public boolean validarAll(Tabela tabela, Jogador player);
	
	public boolean validarLinhas(Tabela tabela, Jogador player);
	
	public boolean validarColunas(Tabela tabela, Jogador player);
	
	public boolean validarDiagonais	(Tabela tabela, Jogador player);
}
