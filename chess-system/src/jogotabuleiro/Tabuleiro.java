package jogotabuleiro;

public class Tabuleiro {
	
	private int linha;
	private int coluna;
	private Peca[][] pecas ;
	
	public Tabuleiro(int linha, int coluna) {
		this.linha = linha;
		this.coluna = coluna;
		
		// minha matriz de peças vai ser instanciadas na quantidade de linhas informadas e colunas 
		pecas = new Peca[linha][coluna]; 
	}
	
	
	
	

}
