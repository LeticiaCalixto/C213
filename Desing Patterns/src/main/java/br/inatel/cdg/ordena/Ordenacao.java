package br.inatel.cdg.ordena;

public abstract class Ordenacao {
	
	//Composicao com instancia de Ordem
	protected Ordem ordem;

	//Comportamento delegado
	public int[] ordenando(int[] vetor) {
		return ordem.ordenando(vetor);
	}


	//Getter e Setter
	public void setOrdem(Ordem ordem) {
		this.ordem = ordem;
	}

	public Ordem getOrdem() {
		return ordem;
	}
}