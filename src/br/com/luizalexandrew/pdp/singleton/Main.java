package br.com.luizalexandrew.pdp.singleton;

public class Main {

	public static void main(String[] args) {

		Pagamento n1 = Pagamento.getInstance();
		n1.pagar();
		Pagamento n2 = Pagamento.getInstance();
		n2.pagar();

		System.out.println(n1.equals(n2));

	}
}
