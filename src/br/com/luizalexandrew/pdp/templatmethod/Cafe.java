package br.com.luizalexandrew.pdp.templatmethod;

public class Cafe extends BebidaQuente {

	@Override
	protected void adicionarIngredientes() {
		System.out.println("Adicionando pó de café instantaneo");
	}

	@Override
	protected void adicionarIngredientesExtras() {
		System.out.println("Adicionando açucar");
		
	}
	
}
