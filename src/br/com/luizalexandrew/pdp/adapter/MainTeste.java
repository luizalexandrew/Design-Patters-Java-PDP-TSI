package br.com.luizalexandrew.pdp.adapter;

public class MainTeste {

	public static void main(String[] args) {

		Happy luiz = new Happy();
		Sad joao = new Sad();
		Carefree gates = new Carefree();
		AnimalEstimacaoAdapter cachorro = new AnimalEstimacaoAdapter(new Cachorro());
		AnimalEstimacaoAdapter cat = new AnimalEstimacaoAdapter(new Gato());
		AnimalEstimacaoAdapter passaro = new AnimalEstimacaoAdapter(new Passaro());
		Psicanalista medico = new Psicanalista();

		medico.examinar(luiz);
		medico.examinar(joao);
		medico.examinar(gates);
		medico.examinar(cachorro);
		medico.examinar(cat);
		medico.examinar(passaro);
		
	}
}
