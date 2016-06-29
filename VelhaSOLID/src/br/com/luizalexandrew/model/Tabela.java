package br.com.luizalexandrew.model;

public interface Tabela {

	void init(Campo campo);
	
	public boolean setInTabela(Jogador player,int x, int y);
	
	public Campo[][] getTabela();
	
	public void imprimir();
	
	public void setCampos(Campo campos[][]);
	
	public int getTamanho();
	
	
	

	
	
	
}
