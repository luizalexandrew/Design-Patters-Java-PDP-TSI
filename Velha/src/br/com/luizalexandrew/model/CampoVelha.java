package br.com.luizalexandrew.model;

public class CampoVelha implements Campo {

	private Character marca;

	public CampoVelha() {
		
		init();
		
	}

	public void init() {
		
		this.marca = ' ';
		
	}

	@Override
	public Campo novo() {
		
		return new CampoVelha();
		
	}

	@Override
	public boolean setValue(Jogador player) {
		
		if (this.marca == ' ') {
			this.marca = player.getMarca();
			return true;
		}
		return false;
		
	}

	@Override
	public String getMarca() {
		
		return "[ " + this.marca + " ]";
		
	}

	@Override
	public Character getValue() {
		
		return this.marca;
		
	}

}
