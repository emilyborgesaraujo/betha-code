package Desafio03;

public class Atividade02 {
    public static void main(String[] args) {

        int[] arrayInteiros = {54,23,45,89};
        int soma = 0;
        double media;

        for (int i=0; i<arrayInteiros.length; i++) {
            soma += arrayInteiros[i];
        }

        media = soma/arrayInteiros.length;
        System.out.println("Média: "+media);

    }
}
