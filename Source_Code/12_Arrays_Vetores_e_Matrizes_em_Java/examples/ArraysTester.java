package lecture10.examples;

import java.util.Arrays;
import java.util.List;

public class ArraysTester {

  private int[] ar;

  public ArraysTester(int numValues) {
    ar = new int[numValues];

    for (int i=0; i < ar.length; i++) {
      ar[i] = (1000 - (300 + i));
    }
  }

  public int[] getAr() {
    return ar;
  }

  public static void main(String[] args) {
    ArraysTester tester = new ArraysTester(50);
    int[] meuArray = tester.getAr();

    // Compara dois Arrays
    int[] meuOutroArray = tester.getAr().clone(); // nao se preocupem com clone por enquanto
    if (Arrays.equals(meuArray, meuOutroArray)) {
      System.out.println("Os arrays são iguais!");
    } else {
      System.out.println("Os arrays são diferentes!");
    }

    // Preenche alguns valores
    Arrays.fill(meuArray, 2, 10, 3);
    meuArray[30] = 98;

    // Exibe o array
    System.out.println("Eis o array desordenado...");
    System.out.println(Arrays.toString(meuArray));
    System.out.println();

    // Ordena o array
    Arrays.sort(meuArray);
    
    // exibe o array, ordenado
    System.out.println("Eis o array ordenado...");
    System.out.println(Arrays.toString(meuArray));
    System.out.println();

    // Obtem o indice de um elemento em particular
    int index = Arrays.binarySearch(meuArray, 98);
    System.out.println("98 está localizado no array, no índice número " + index);

    String[][] ticTacToe = { {"X", "O", "O"},
                             {"O", "X", "X"}, 
                             {"X", "O", "X"}};
    System.out.println(Arrays.deepToString(ticTacToe));

    String[][] ticTacToe2 = { {"O", "O", "X"},
                              {"O", "X", "X"}, 
                              {"X", "O", "X"}};

    String[][] ticTacToe3 = { {"X", "O", "O"},
                              {"O", "X", "X"}, 
                              {"X", "O", "X"}};

    if (Arrays.deepEquals(ticTacToe, ticTacToe2)) {
      System.out.println("Matrizes 1 e 2 são iguais.");
    } else {
      System.out.println("Matrizes 1 e 2 são diferentes.");
    }

    if (Arrays.deepEquals(ticTacToe, ticTacToe3)) {
      System.out.println("Matrizes 1 e 3 são iguais.");
    } else {
      System.out.println("Matrizes 1 e 3 são diferentes.");
    }
  }
}