package br.com.luizalexandrew.pdp.abstractfactory;

public class Cliente {

	public static void main(String[] args) {

		Celular moto = montarCelular("Moto X");
		Celular iphone = montarCelular("iPhone");
		Celular lumia = montarCelular("Lumia");
		Celular galaxy = montarCelular("Galaxy S7");

		moto.imprimirNome();
		iphone.imprimirNome();
		lumia.imprimirNome();
		galaxy.imprimirNome();

	}

	public static Celular montarCelular(String nome) {
		
		Celular cf = null;
		switch (nome) {
		case "Moto X":
			cf = new MotoXFactory();
			break;
		case "iPhone":
			cf = new IPhoneFactory();
			break;
		case "Lumia":
			cf = new LumiaFactory();
			break;
		case "Galaxy S7":
			cf = new GalaxySFactory();
			break;
		default:
			break;
		}
		return cf;
		
	}
}
