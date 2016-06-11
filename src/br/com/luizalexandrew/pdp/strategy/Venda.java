package br.com.luizalexandrew.pdp.strategy;
public class Venda {

	private double valorVenda;
	private Funcionario funcionario;

	public Venda(Funcionario funcionario){
		this.funcionario = funcionario;
	}

	public void save() {

		double valorComissao = this.funcionario.getCargo().calcularComissao(this.valorVenda);
		
		System.out.println(valorComissao);
	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
}