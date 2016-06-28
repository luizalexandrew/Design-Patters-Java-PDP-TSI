package br.com.luizalexandrew.model;

public class JogadorVelha implements Jogador {

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
