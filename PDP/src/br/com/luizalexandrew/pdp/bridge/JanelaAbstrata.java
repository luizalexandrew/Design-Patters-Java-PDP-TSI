package br.com.luizalexandrew.pdp.bridge;

public abstract class JanelaAbstrata {
	
	protected JanelaImplementada janela;
	
	public abstract void desenhar();
	
	public JanelaAbstrata(JanelaImplementada j) {
        janela = j;
    }
	
	public void desenharJanela(String titulo) {
        janela.desenharJanela(titulo);
    }
	
	public void desenharBotao(String titulo) {
        janela.desenharBotao(titulo);
    }

}
