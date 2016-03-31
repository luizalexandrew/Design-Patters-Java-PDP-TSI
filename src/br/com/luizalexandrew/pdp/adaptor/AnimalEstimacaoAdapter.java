package br.com.luizalexandrew.pdp.adaptor;

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
