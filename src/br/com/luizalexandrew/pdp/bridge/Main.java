package br.com.luizalexandrew.pdp.bridge;

public class Main {

	public static void main(String[] args) {
		
//		JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
//	    janela.desenhar();
//	    janela = new JanelaAviso(new JanelaLinux());
//	    janela.desenhar();
	 
	    JanelaAbstrata janela2 = new JanelaDialogo(new JanelaWindows());
	    janela2.desenhar();
	    janela2 = new JanelaAviso(new JanelaWindows());
	    janela2.desenhar();
	}

}
