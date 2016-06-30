package br.com.luizalexandrew.model;

public interface Campo {
	
	public void init();
	
	public Campo novo();
	
	public boolean setValue(Jogador player);
	
	public Character getValue();
	
	public String getMarca();

}
