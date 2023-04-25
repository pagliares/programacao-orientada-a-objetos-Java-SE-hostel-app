/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pagliares.jsr166.quicksort;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 *
 * @author pagliares
 */
public class QuicksortParalelo  extends RecursiveAction {
    private static final int LIMITE_SEQUENCIAL = 100_000;
 
    private final int[] numeros;
    private final int i;
    private final int j;
    
    public QuicksortParalelo(int[] numeros, int i, int j) {
        this.numeros = numeros;
        this.i = i;
        this.j = j;
    }
 
    @Override
    protected void compute() {
        if (j - i < LIMITE_SEQUENCIAL) { // Problema simples. Sem paralelismo
            Arrays.sort(numeros, i, j + 1);
        } else {
            int indicePivo = particionarAoRedorDoPivo(i, j);
             
            QuicksortParalelo t1 = null;
            QuicksortParalelo t2 = null;
            if (i < indicePivo)
                 t1 = new QuicksortParalelo(numeros, i, indicePivo);
             if (indicePivo + 1 < j)
                t2 = new QuicksortParalelo(numeros, indicePivo + 1, j);
             invokeAll(t1, t2);
        }
    }    
    
    private int particionarAoRedorDoPivo(int indiceEsquerdo, int indiceDireito) {
        // Escolhendo o pivô no meio do array. Poderia ser qualquer outro número
        int pivotValue = numeros[indiceEsquerdo + (indiceDireito - indiceEsquerdo) / 2];

        --indiceEsquerdo;
        ++indiceDireito;

        while (true) {
            do
                ++indiceEsquerdo;
            while (numeros[indiceEsquerdo] < pivotValue);

            do
                --indiceDireito;
            while (numeros[indiceDireito] > pivotValue);

            if (indiceEsquerdo < indiceDireito) {
                trocar(indiceEsquerdo, indiceDireito); 
            } else {
                return indiceDireito;
            }
        }
    }
    private void trocar(int i, int j) {
        int temp = numeros[i];
        numeros[i] = numeros[j];
        numeros[j] = temp;
    }
}
