package br.com.luizalexandrew.pdp.adapter;

public class Happy extends Paciente{
	
	public Happy() {
		this.emocao = "Estou feliz";
	}

	@Override
	public void queryModd() {
		System.out.println(this.emocao + " :D");
	}
	
}
