package br.com.luizalexandrew.pdp.adapter;

public class Passaro extends AnimalEstimacao {
	
	public Passaro(){
		this.barulho = "PIUPIU PIUPIU";
	}
	
	@Override
	public String speak() {
		return barulho;
	}

}
