package br.com.luizalexandrew.pdp.bridge;

public class JanelaWindows implements JanelaImplementada {

	@Override
	public void desenharJanela(String titulo) {
		System.out.println("\n" + titulo + " - Janela Windows");
	}

	@Override
	public void desenharBotao(String titulo) {
		System.out.println(titulo + " - Botão Windows");
	}

}
