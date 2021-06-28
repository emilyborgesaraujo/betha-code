package Aula2606;

import java.util.Arrays;

public class OrdenaçãoArray {
    public static void main(String[] args) {
        //Criação do array de 10.000 posições
        int[] arrayInteiros = new int[10000];
        //Atribuindo os valores a cada posição
        for (int i = 10000; i > 0; i--) {
            arrayInteiros[arrayInteiros.length - i] = i;
        }

        boolean estaOrdenado = false;
        long inicio = System.currentTimeMillis();
        while (!estaOrdenado) {
            estaOrdenado = true;
            for(int i = 1; i < arrayInteiros.length; i++) {
                if (arrayInteiros[i-1] > arrayInteiros[i]) {
                    estaOrdenado = false;
                    int aux = arrayInteiros[i];
                    arrayInteiros[i] = arrayInteiros[i-1];
                    arrayInteiros[i-1] = aux;
                }
            }
        }
        //armazena o tempo fim da ordenação
        long fim = System.currentTimeMillis();
        System.out.println("Tempo ordenar 1: "+(fim-inicio)+" ms");

        for(int i = 10000; i>0; i--) {
            arrayInteiros[arrayInteiros.length - i] = i;
        }

        inicio = System.currentTimeMillis();
        Arrays.sort(arrayInteiros);
        fim = System.currentTimeMillis();
        System.out.println("Tempo ordenar 2: "+(fim-inicio)+" ms");
    }
}
