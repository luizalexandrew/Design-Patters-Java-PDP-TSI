package br.com.luizalexandrew.pdp.templatmethod;

public class CafeTurco extends BebidaQuente{

	@Override
	protected void adicionarIngredientes() {
		System.out.println("Adicionando o café");
	}

	@Override
	protected void adicionarIngredientesExtras() {
		System.out.println("Adicionando amargo");
		
	}

}
