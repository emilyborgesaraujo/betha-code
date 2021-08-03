package Aula3107;

public class Presidente extends Funcionario{

    public Presidente(String nome, Double bonificacao) {
        super(nome, bonificacao);
    }

    public Double getBonificacao() {
        return super.getSalario()*1.10;
    }
}
