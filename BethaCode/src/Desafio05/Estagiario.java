package Desafio05;

public class Estagiario extends Funcionario{

    public Estagiario(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public Double getSalarioBruto() {
        return super.getSalarioBruto()+(super.getSalarioBruto()*0.05);
    }
}
