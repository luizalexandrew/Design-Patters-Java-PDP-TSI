package br.com.luizalexandrew.pdp.strategy;

public class Main {

	public static void main(String[] args) {
		
		Funcionario func = new Funcionario(Cargo.ATENDENTE);
				
		Venda venda = new Venda(func);
		venda.setValorVenda(1000);
		venda.save();

	}

}
