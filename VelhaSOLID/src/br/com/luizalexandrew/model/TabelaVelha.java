package br.com.luizalexandrew.model;

public class TabelaVelha implements Tabela{
	
	private final int tamanho = 3;
	private Campo campos[][] = new Campo[3][3];
	
	public TabelaVelha(Campo campo) {
		init(campo);
	}

	@Override
	public void init(Campo campo) {
		for(int i = 0; i < tamanho;i++)
			for(int y = 0; y < tamanho;y++)
				campos[i][y] = campo.novo();
	}

	@Override
	public boolean setInTabela(Jogador player, int x, int y) {
		return this.campos[x][y].setMarca(player);		
	}

	@Override
	public Campo[][] getTabela() {
		return campos;
	}

	@Override
	public void imprimir() {
		for(int i = 0; i < tamanho;i++){
			System.out.print("\n\n");
			for(int y = 0; y < tamanho;y++){
				System.out.print(campos[i][y].getMarca());
			}
		}
	}
	
	
}
