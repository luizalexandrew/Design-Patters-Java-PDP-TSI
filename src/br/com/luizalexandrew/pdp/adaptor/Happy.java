package br.com.luizalexandrew.pdp.adaptor;

public class Happy extends Paciente{
	
	public Happy() {
		this.emocao = "Estou feliz";
	}

	@Override
	public void queryModd() {
		System.out.println(this.emocao + " :D");
	}
	
}
