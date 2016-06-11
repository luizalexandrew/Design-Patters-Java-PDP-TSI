package br.com.luizalexandrew.pdp.strategy;

public class Funcionario {

	private long id;
	private Strategy cargo;
	
	public Funcionario(Cargo cargo){
		
		this.cargo = cargo;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Strategy getCargo() {
		return cargo;
	}

	public void setCargo(Strategy cargo) {
		this.cargo = cargo;
	}
	
	
	
	
}
