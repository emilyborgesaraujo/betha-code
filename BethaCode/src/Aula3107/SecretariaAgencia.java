package Aula3107;

public class SecretariaAgencia extends Secretaria{

    public SecretariaAgencia(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonificacao() {
        return getSalario()*1.07;
    }
}
