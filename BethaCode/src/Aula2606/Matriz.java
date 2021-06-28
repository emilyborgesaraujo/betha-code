package Aula2606;

public class Matriz {
    public static void main(String[] args) {

        double matriz[][] = new double[4][4]; //declaração e construção da matriz

        for (int i = 0; i < matriz.length; i++) { //percorre a matriz no eixo 1
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = i*j;//atribui o valor a coluna
            }
        }

        for (int i=0; i<matriz.length; i++) { //percorre a matriz no eixo 1
            for (int j=0; j<matriz[i].length; j++) {
                //imprime o resultado
                System.out.println("Valor da posição ["+i+","+j+"]: "+matriz[i][j]);
            }
        }
    }
}
