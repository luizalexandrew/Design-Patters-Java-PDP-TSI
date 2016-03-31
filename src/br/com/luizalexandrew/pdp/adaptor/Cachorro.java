package br.com.luizalexandrew.pdp.adaptor;

public class Cachorro extends AnimalEstimacao{

	public Cachorro(){
		this.barulho = "AUAUAUAUAU AUAUAUAUAU";
	}
	
	@Override
	public String speak() {
		return barulho;
	}

}
