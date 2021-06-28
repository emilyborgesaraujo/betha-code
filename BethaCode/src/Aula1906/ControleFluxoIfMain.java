package Aula1906;

public class ControleFluxoIfMain {
    public static void main(String[] args) {
        int ano = 2020;
        double altura = 1.4;
        double salario = 15000;

        if (ano < 0) {
            System.out.println("Não é um ano!!");
        } else if ((ano%4==0 && ano%100!=0) || (ano%400==0)) {
            System.out.println("É bissexto!");
        } else {
            System.out.println("Não é bissexto!");
        }

        if (10==20) {
            System.out.println("É igual");
        } else {
            System.out.println("É diferente");
        }

        if (altura < 1.5) {
            System.out.println("Baixinho!");
        } else {
            System.out.println("Altinho!");
        }

        if (salario > 15000) {
            System.out.println("É o salário do Carrion");
        } else {
            System.out.println("Não é o salário do Carrion");
        }
    }
}
