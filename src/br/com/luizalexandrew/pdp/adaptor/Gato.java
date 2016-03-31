package br.com.luizalexandrew.pdp.adaptor;

public class Gato extends AnimalEstimacao{

	public Gato(){
		this.barulho = "MIAUMIAU MIAUMIAU";
	}
	
	@Override
	public String speak() {
		return barulho;
	}

}
