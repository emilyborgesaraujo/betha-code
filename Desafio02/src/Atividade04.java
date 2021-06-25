import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        String numeroInvertido = "";
        char seqNum[];

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número de até 4 dígitos:");
        int numero = s.nextInt();
        seqNum = Integer.toString(numero).toCharArray();

        if (numero > 9999) {
            System.out.println("Número deve ter apenas 4 dígitos");
        } else {
            for (int i = seqNum.length - 1; i >= 0; i--) {
                numeroInvertido += seqNum[i];
            }
        }

        System.out.println("Número invertido: " + numeroInvertido);
    }
}
