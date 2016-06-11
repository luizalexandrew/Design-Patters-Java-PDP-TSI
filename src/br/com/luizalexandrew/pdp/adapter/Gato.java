package br.com.luizalexandrew.pdp.adapter;

public class Gato extends AnimalEstimacao{

	public Gato(){
		this.barulho = "MIAUMIAU MIAUMIAU";
	}
	
	@Override
	public String speak() {
		return barulho;
	}

}
