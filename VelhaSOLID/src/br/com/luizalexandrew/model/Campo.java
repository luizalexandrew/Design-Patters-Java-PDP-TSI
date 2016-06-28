package br.com.luizalexandrew.model;

public interface Campo {
	
	public void init();
	
	public boolean setMarca(Jogador player);
	
	public String getMarca();
	
	public Character getValue();
	
	public Campo novo();

}
