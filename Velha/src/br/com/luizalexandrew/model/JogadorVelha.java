package br.com.luizalexandrew.model;

public class JogadorVelha implements Jogador {

	private Character marca;
		
	public JogadorVelha(Character marca){
		
		this.marca = marca;
		
	}

	@Override
	public Character getMarca() {
		
		return marca;	
		
	}

	@Override
	public void setMarca(Character marca) {
		
		this.marca = marca;	
		
	}

}
