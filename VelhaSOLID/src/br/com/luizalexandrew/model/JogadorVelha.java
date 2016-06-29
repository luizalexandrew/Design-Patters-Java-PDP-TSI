package br.com.luizalexandrew.model;

public class JogadorVelha implements Jogador {

	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private Character marca;
	
	
	@Override
	public Character getMarca() {
		return marca;
		
	}

	@Override
	public void init(Character marca) {
		this.marca = marca;		
	}

	

}
