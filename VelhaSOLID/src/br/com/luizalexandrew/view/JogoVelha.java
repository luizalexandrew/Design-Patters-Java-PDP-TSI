package br.com.luizalexandrew.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.luizalexandrew.model.Campo;
import br.com.luizalexandrew.model.Jogador;
import br.com.luizalexandrew.model.Tabela;
import br.com.luizalexandrew.model.Validador;

public class JogoVelha extends JFrame{

	private static final long serialVersionUID = 1L;
	private int tamanho;
	private Jogador player1;
	private Jogador player2;
	private Jogador jogador;
	private Tabela tabela;
	private Validador validador;
	private boolean vencedor = false;
	
	private JButton botoes[][];
	private JButton btnNovoJogo;
	private JLabel label;

	public JogoVelha(Tabela tabela, Jogador player1, Jogador player2, Validador validador) {
		
		this.tabela = tabela;
		this.player1 = player1;
		this.player2 = player2;
		this.validador = validador;		
		this.jogador = player1;
        this.tamanho = tabela.getTamanho();
		this.botoes = new JButton[tabela.getTamanho()][tabela.getTamanho()];
		iniciarJanela();
		adicionarBotoesAcoes();
        adicionarBotoesJogo();

	}
	
	public void iniciarJanela(){
		this.setTitle("Jogo da Velha");
		label=new JLabel(" ");
		label.setBounds(5, 5, 150, 20);
		label.setText(" ");
		this.add(label);
        this.setBounds(0, 0, 110*tabela.getTamanho(), 110*tabela.getTamanho()+120);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
	}
	
	public void adicionarBotoesAcoes(){
		btnNovoJogo = new JButton();
		btnNovoJogo.setText("Novo Jogo");
		btnNovoJogo.setBounds(175, 5, 150, 40);
		this.add(btnNovoJogo);
		btnNovoJogo.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	novoJogo();
	        }
	    });
	}
	
	public void novoJogo(){
		vencedor = false;
		Campo campos[][] = tabela.getTabela();
		
		for(int i = 0; i<tamanho;i++)
			for(int y =0; y<tamanho;y++){
				campos[i][y].init();
			}
				
		tabela.setCampos(campos);
		limparCampos();
	}
		
	
	public void adicionarBotoesJogo(){
		
		for(int i = 0; i < tamanho;i++){
			for(int y = 0; y < tamanho;y++){
				botoes[i][y] = new JButton();
				botoes[i][y].setText("  ");
				botoes[i][y].setName("${"+ i + "," + y+"}");
				botoes[i][y].setBounds(14+(110*y), 90+(110*i), 80, 80);
				this.add(botoes[i][y]);
				
				botoes[i][y].addActionListener(new ActionListener() {
			        public void actionPerformed(ActionEvent evt) {
			        	marcarCampo(evt);
			        }
			    });
			}
		}	
	}
	
	public void limparCampos(){
		label.setText(" ");
		for(int i = 0; i < tamanho;i++){
			for(int y = 0; y < tamanho;y++){
				botoes[i][y].setText("  ");
			}
		}			
	}

	public void marcarCampo(ActionEvent evt){
		String evento = evt.toString();
    	String n = evt.toString().substring(evento.indexOf("{") + 1, evento.indexOf("}"));
    	int x = Integer.parseInt(n.substring(0, 1));
    	int y = Integer.parseInt(n.substring(2, 3));
    	if(vencedor == false && tabela.setInTabela(jogador, x, y)){
    		botoes[x][y].setText(jogador.getMarca().toString());
    		if(validador.validar(tabela, jogador)){ 
    			vencedor = true;
    			label.setText("Jogador ( " + jogador.getMarca() + " ) Venceu ");
    		}
    			
    		trocarJogador();
    		
    	}  		
	}
	
	public void trocarJogador(){		
		if(jogador == player1){
			jogador = player2;
		}else{
			jogador = player1;
		}
	}
	
}
