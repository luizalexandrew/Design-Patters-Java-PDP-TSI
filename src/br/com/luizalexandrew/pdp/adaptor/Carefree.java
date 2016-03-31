package br.com.luizalexandrew.pdp.adaptor;

public class Carefree extends Paciente{

	public Carefree() {
		this.emocao = "Estou tranquilo";
	}

	@Override
	public void queryModd() {
		System.out.println(emocao);
	}

}
