package br.inatel.cdg.ordena.ordens.impl;

import br.inatel.cdg.ordena.Ordem;

public class OrdemBubbleSort implements Ordem {

	@Override
	public int[] ordenando(int[] vetor) {
		boolean ordem = true;
		int aux;
		while (ordem) {
			ordem = false;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i + 1]) {
					aux = vetor[i];
					vetor[i] = vetor[i + 1];
					vetor[i + 1] = aux;
					ordem = true;
				}
			}
		}
		return vetor;
	}

}
