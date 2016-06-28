package br.com.luizalexandrew.pdp.adapter;

public class AnimalEstimacaoAdapter extends Paciente {

	private AnimalEstimacao animal;

	public AnimalEstimacaoAdapter(AnimalEstimacao animal) {
		this.animal = animal;
	}

	@Override
	public void queryModd() {
		System.out.println(this.animal.speak());
	}
	
}
