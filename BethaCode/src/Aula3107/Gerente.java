package Aula3107;

public class Gerente extends Funcionario{

    public Gerente(String nome, Double salario) {
        super(nome, salario);
    }

    public Double getBonificacao() {
        return super.getSalario()*1.15;
    }
}
