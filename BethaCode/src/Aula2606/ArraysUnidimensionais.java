package Aula2606;

public class ArraysUnidimensionais {
    public static void main(String[] args) {
        int[] jogoSena; //Criação
        jogoSena = new int[6]; //Declaração

        //maneira1DeAtribuição
        jogoSena[0] = 23;
        jogoSena[1] = 12;
        jogoSena[2] = 55;
        jogoSena[3] = 02;
        jogoSena[4] = 07;
        jogoSena[5] = 19;

        for (int i = 0; i < jogoSena.length; i++) {
            System.out.print(jogoSena[i]+" - ");
        }

        System.out.println("");

        //maneira2DeAtribuição
        int[] outroJogoSena = { 23, 12, 55, 02, 07, 19};

        for (int i = 0; i < outroJogoSena.length; i++) {
            System.out.print(outroJogoSena[i]+" - ");
        }

    }
}
