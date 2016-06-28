package br.com.luizalexandrew.pdp.adapter;

public class Carefree extends Paciente{

	public Carefree() {
		this.emocao = "Estou tranquilo";
	}

	@Override
	public void queryModd() {
		System.out.println(emocao);
	}

}
