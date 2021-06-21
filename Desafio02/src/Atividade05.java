import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Digite a base menor:");
        double baseMenor = s.nextDouble();

        System.out.println("Digite a base maior:");
        double baseMaior = s.nextDouble();

        System.out.println("Digite a altura:");
        double altura = s.nextDouble();

        double area = ((altura*(baseMenor+baseMaior))/2);

        System.out.println("O cálculo da área do trapézio é igual a " + area);
    }
}
