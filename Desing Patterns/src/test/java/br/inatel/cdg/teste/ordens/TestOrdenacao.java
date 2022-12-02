package br.inatel.cdg.teste.ordens;

import br.inatel.cdg.ordena.BubbleSort;
import br.inatel.cdg.ordena.InsertionSort;
import br.inatel.cdg.ordena.SelectionSort;
import org.junit.Test;
import br.inatel.cdg.ordena.Ordenacao;

import static org.junit.Assert.*;

public class TestOrdenacao {
	
	Ordenacao ordenacao;

	@Test
	public void testeOrdemBubbleSort() {
		ordenacao = new BubbleSort();
		int[] vetor = {17,5,23};
		int[] esperado = {5,17,23};
		assertArrayEquals(ordenacao.ordenando(vetor),esperado);
	}

	@Test
	public void testeOrdemInsertionSort() {
		ordenacao = new InsertionSort();
		int[] vetor = {5, 9, 1};
		int[] esperado = {1,5,9};
		assertArrayEquals(ordenacao.ordenando(vetor),esperado);
	}

	@Test
	public void testeOrdemSelectionSort() {
		ordenacao = new SelectionSort();
		int[] vetor = {5, 9, 1};
		int[] esperado = {1,5,9};
		assertArrayEquals(ordenacao.ordenando(vetor),esperado);
	}


}
