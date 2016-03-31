package br.com.luizalexandrew.pdp.adaptor;

public class Sad extends Paciente{
	
	public Sad() {
		this.emocao = "Estou triste";
	}

	@Override
	public void queryModd() {
		System.out.println(this.emocao + " :(");
	}
	
}
