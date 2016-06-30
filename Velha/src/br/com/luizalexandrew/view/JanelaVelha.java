package br.com.luizalexandrew.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.luizalexandrew.controller.LimparJanelaVelha;
import br.com.luizalexandrew.controller.MarcarCampoVelha;
import br.com.luizalexandrew.controller.LimparCamposTabelaVelha;
import br.com.luizalexandrew.model.Jogador;
import br.com.luizalexandrew.model.Tabela;
import br.com.luizalexandrew.model.Validador;

public class JanelaVelha extends JFrame{

	private static final long serialVersionUID = 1L;
	private int tamanho;
	private Jogador player1;
	private Jogador player2;
	private Jogador jogador;
	private Tabela tabela;
	private Validador validador;
	
	private JButton botoes[][];
	private JButton btnNovoJogo;
	private JLabel label;

	public JanelaVelha(Tabela tabela, Jogador player1, Jogador player2, Validador validador) {
		
		this.tabela = tabela;
		this.player1 = player1;
		this.player2 = player2;
		this.validador = validador;		
		this.jogador = player1;
        this.tamanho = tabela.getTamanho();
		this.botoes = new JButton[tabela.getTamanho()][tabela.getTamanho()];
		
		init();

	}
	
	public void init(){
		
		criarJanela();
		criarBotoesNovoJogo();
        adicionarCamposJogo();
	
	}
	
	public void criarJanela(){
		
		this.setTitle("Jogo da Velha");
		criarLabelResultado();
        this.setBounds(0, 0, 110*tabela.getTamanho(), 110*tabela.getTamanho()+120);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.getContentPane().setLayout(null);
        
	}
	
	public void criarLabelResultado(){
		
		label=new JLabel(" ");
		label.setBounds(5, 5, 150, 20);
		label.setText(" ");
		this.add(label);
		
	}
	
	public void criarBotoesNovoJogo(){
		
		btnNovoJogo = new JButton();
		btnNovoJogo.setText("Novo Jogo");
		btnNovoJogo.setBounds(175, 5, 150, 40);
		this.add(btnNovoJogo);
		btnNovoJogo.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	iniciarNovoJogo();
	        }
	    });
		
	}
	
	public void adicionarCamposJogo(){
		
		for(int i = 0; i < tamanho;i++){
			for(int y = 0; y < tamanho;y++){
				botoes[i][y] = criarBotao(i,y);
				this.add(botoes[i][y]);
			}
		}	
		
	}
	
	public JButton criarBotao(int i, int y){
		
		JButton bnt = new JButton();
		bnt.setText("  ");
		bnt.setName("${"+ i + "," + y+"}");
		bnt.setBounds(14+(110*y), 90+(110*i), 80, 80);
		bnt.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent evt) {
	        	marcarCampo(evt);
	        }
	    });		
		return bnt;		
		
	}
	
	public void iniciarNovoJogo(){

		LimparCamposTabelaVelha.limpar(tabela);
		
		LimparJanelaVelha.limpar(this);
		
	}
	
	public void abrir(){
		
		this.setVisible(true);
		
	}
	
	public void marcarCampo(ActionEvent evt){
		
		MarcarCampoVelha.marcar(evt, this);
				
	}
	
	public Jogador getPlayer1() {
		
		return player1;
		
	}

	public void setPlayer1(Jogador player1) {
		
		this.player1 = player1;
		
	}

	public Jogador getPlayer2() {
		
		return player2;
		
	}

	public void setPlayer2(Jogador player2) {
		
		this.player2 = player2;
		
	}

	public Validador getValidador() {
		
		return validador;
		
	}

	public void setValidador(Validador validador) {
		
		this.validador = validador;
	
	}

	public Jogador getJogador() {
		
		return jogador;
		
	}

	public void setJogador(Jogador jogador) {
		
		this.jogador = jogador;
		
	}

	public Tabela getTabela() {
		
		return tabela;
		
	}

	public void setTabela(Tabela tabela) {
		
		this.tabela = tabela;
		
	}

	public JButton[][] getBotoes() {
		
		return botoes;
		
	}
	
	public int getTamanho() {
		
		return tamanho;
		
	}

	public JLabel getLabel() {
		
		return label;
		
	}

	public void setLabel(JLabel label) {
		
		this.label = label;
		
	}
	
}
