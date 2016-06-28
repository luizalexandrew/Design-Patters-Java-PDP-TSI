package br.com.luizalexandrew.pdp.templatmethod;

public class Cha extends BebidaQuente{

	@Override
	protected void adicionarIngredientes() {
		System.out.println("Adicionando ervas");
		
	}

	@Override
	protected void adicionarIngredientesExtras() {
		System.out.println("Adicionando canela");
		
	}

}
