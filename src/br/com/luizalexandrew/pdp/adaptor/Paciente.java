package br.com.luizalexandrew.pdp.adaptor;

public abstract class Paciente {

	protected String emocao;
	
	public abstract void queryModd();

	public void setEmocao(String emocao) {
		this.emocao = emocao;
	}
}
