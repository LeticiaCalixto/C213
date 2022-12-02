package br.inatel.cdg.ordena;

import br.inatel.cdg.ordena.ordens.impl.OrdemInsertionSort;

public class InsertionSort extends Ordenacao {

	public InsertionSort() {
		//Inicializado no construtor com um FreteSedex
		ordem = new OrdemInsertionSort();
	}

}