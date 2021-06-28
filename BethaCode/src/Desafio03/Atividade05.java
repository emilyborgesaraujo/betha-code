package Desafio03;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {

        String[] array = new String[10];
        String[] arrayInvertido = new String[10];

        Scanner s = new Scanner(System.in);

        for (int i=0; i<10; i++) {
            System.out.println("Digite um texto para o elemento "+i+" do array:");
            String texto = s.nextLine();

            array[i] = texto;
        }

        for(int j=0; j < array.length; j++) {
            arrayInvertido[j] = array[array.length-1-j];
            System.out.print(arrayInvertido[j]+" - ");
        }
    }
}
