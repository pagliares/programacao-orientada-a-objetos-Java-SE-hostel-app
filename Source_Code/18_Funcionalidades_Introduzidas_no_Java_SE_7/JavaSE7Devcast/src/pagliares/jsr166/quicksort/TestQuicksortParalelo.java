/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pagliares.jsr166.quicksort;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

/**
 *
 * @author pagliares
 */
public class TestQuicksortParalelo {
    
    public static final int ARRAY_SIZE = 10_000_000;
    public static int[] numeros;

    public static void main(String[] args) {
        int[] numeros = makeRandomArray();
         benchmarkParalelo();
        
        numeros = makeRandomArray();
        benchmarkSequencial();
        System.out.println("\n O conjunto de números foi ordenado com sucesso...: " + foiOrdenadoComSucesso(numeros));
    }

    public static int[] makeRandomArray() {
        Random rand = new Random();
        numeros = new int[ARRAY_SIZE];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt();
        }
        return numeros;
    }
    

    public static void benchmarkSequencial() {
        long tempoInicial = System.currentTimeMillis();
        Arrays.sort(numeros);
        long tempoFinal = System.currentTimeMillis();
        long tempoDecorrido = tempoFinal - tempoInicial;
        exibirResultados(tempoDecorrido, "sequencial");    
      
    }
    
    public static void benchmarkParalelo() {
        long beginTime = System.currentTimeMillis();
        QuicksortParalelo rootTask = new QuicksortParalelo(numeros, 0, numeros.length - 1);
        ForkJoinPool poolThreads = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        poolThreads.invoke(rootTask);
        long end = System.currentTimeMillis();
        long tempoDecorrido = end - beginTime;
        exibirResultados(tempoDecorrido, "paralelo");
    }

    public static void exibirResultados(long tempoDecorrido, String tipo) {
//        for (int numero: numeros)
//            System.out.print(numero + ", ");
            System.out.println("\nTempo gasto para execução da tarefa "  + tipo + "...: " + tempoDecorrido + " milisegundos");

    }

    public static boolean foiOrdenadoComSucesso(int[] numeros) {
        int menor = Integer.MIN_VALUE;
        for (int valor : numeros) {
            if (valor < menor) {
                return false;
            }
            menor = valor;
        }
        return true;
    }
}
