package br.com.luizalexandrew.pdp.templatmethod;

public abstract class BebidaQuente {
	
	protected abstract void adicionarIngredientes();
	
	protected abstract void adicionarIngredientesExtras();
		
	protected final void ferverAgua(){
		System.out.println("Fervendo a água");
	}
	
	protected final void despejarXicara(){
		System.out.println("Despejando a água em uma Xícara");
	}
	
	protected final void servir(){
		System.out.println("Servindo bebida");
	}
	
	public void prepararBebida() {
		System.out.println("---------------------------");
		ferverAgua();
		despejarXicara();
		adicionarIngredientes();
		adicionarIngredientesExtras();
		servir();
		System.out.println("............................");
	}
		
}
