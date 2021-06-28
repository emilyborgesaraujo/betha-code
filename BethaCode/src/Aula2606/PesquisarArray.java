package Aula2606;

import java.util.Arrays;

public class PesquisarArray {
    public static void main(String[] args) {
        int[] numerosInteiros = new int[1000000];
        int numPesquisado = 555000;

        for (int i = 0; i<1000000; i++) {
            numerosInteiros[i] = i;
        }

        long inicio = System.currentTimeMillis();

        for (int i = 0; i<1000000; i++) {
            if(numerosInteiros[i] == numPesquisado) {
                break;
            }
        }

        long fim = System.currentTimeMillis();

        System.out.println("Pesquisa 1 "+(fim-inicio)+" ms");

        inicio = System.currentTimeMillis();

        Arrays.binarySearch(numerosInteiros,numPesquisado);

        fim = System.currentTimeMillis();

        System.out.println("Pesquisa 2 "+(fim-inicio)+" ms");

    }
}
