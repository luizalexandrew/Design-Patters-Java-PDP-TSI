package br.com.luizalexandrew.pdp.bridge;

public class JanelaLinux implements JanelaImplementada{

	@Override
	public void desenharJanela(String titulo) {
		System.out.println("\n" + titulo + " - Janela Linux");
	}

	@Override
	public void desenharBotao(String titulo) {
		System.out.println(titulo + " - Botão Linux");
	}

}
