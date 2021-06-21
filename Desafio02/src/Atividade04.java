import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        int numeroInvertido = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Digite um número de até 4 dígitos:");
        int numero = s.nextInt();

        if (numero > 9999) {
            System.out.println("Número deve ter apenas 4 dígitos");
        } else {
            while (numero>0) {
                numeroInvertido *= 10;
                numeroInvertido += (numero % 10);
                numero /= 10;
            }
        }

        System.out.println("Número invertido: " + numeroInvertido);
    }
}
