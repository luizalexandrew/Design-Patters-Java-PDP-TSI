package br.com.luizalexandrew.pdp.adapter;

public class Cachorro extends AnimalEstimacao{

	public Cachorro(){
		this.barulho = "AUAUAUAUAU AUAUAUAUAU";
	}
	
	@Override
	public String speak() {
		return barulho;
	}

}
