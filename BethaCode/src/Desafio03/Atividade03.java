package Desafio03;

public class Atividade03 {
    public static void main(String[] args) {

        String[] frutas = {"Abacaxi","Amora","Laranja","Maçã","Mamão","Manga","Melão","Pera","Pêssego","Uva"};
        String[] inv = new String[10];

        for(int i=0; i < frutas.length; i++) {
            inv[i] = frutas[frutas.length-1-i];
            System.out.print(inv[i]+" - ");
        }

    }
}
