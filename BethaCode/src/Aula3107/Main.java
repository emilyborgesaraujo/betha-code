package Aula3107;

public class Main {
    public static void main(String[] args) {
        Funcionario gerente = new SecretariaAgencia("João",1000.00);
        System.out.println(gerente.getBonificacao());
    }
}
