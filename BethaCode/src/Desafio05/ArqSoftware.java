package Desafio05;

public class ArqSoftware extends Funcionario {

    public ArqSoftware(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public Double getSalarioBruto() {
        return super.getSalarioBruto()+(super.getSalarioBruto()*0.15);
    }
}
