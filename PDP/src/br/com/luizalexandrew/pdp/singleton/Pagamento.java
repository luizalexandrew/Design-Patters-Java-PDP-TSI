package br.com.luizalexandrew.pdp.singleton;

public class Pagamento {

	private static Pagamento instance;

	protected Pagamento() {
		//...
	};

	public static Pagamento getInstance() {
		if (instance == null) {
			instance = new Pagamento();
		}
		return instance;
	}

	public void pagar() {
		System.out.println("Pagando Funcionario...");
	}

}
