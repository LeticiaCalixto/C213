package br.inatel.cdg.ordena;

import br.inatel.cdg.ordena.ordens.impl.OrdemSelectionSort;

public class SelectionSort extends Ordenacao {

    public SelectionSort() {
        ordem = new OrdemSelectionSort();
    }
}
