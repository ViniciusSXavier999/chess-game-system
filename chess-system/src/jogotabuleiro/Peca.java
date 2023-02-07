package jogotabuleiro;

public class Peca {
	
	protected Posicao posicao;
	private Tabuleiro tabuleiro;
	
	public Peca(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	/*Somente classes no mesmo pacote e subclasses que vão poder acessar o tabuleiro de uma peça, eu não vou
	 * querer que o tabuleiro seja acessivel pela camada de xadrez, o tabuleiro é de uso interno da camada de tabuleiro
	 *   */
	protected Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	
	

}
