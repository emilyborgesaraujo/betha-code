package Desafio03;

public class Atividade01 {
    public static void main(String[] args) {

        int[] numerosInteiros = new int[10];

        for (int i=0; i<numerosInteiros.length; i++) {
            numerosInteiros[i] = i*2;
            System.out.println(numerosInteiros[i]);
        }
    }
}
