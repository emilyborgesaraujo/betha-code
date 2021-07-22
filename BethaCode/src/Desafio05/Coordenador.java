package Desafio05;

public class Coordenador extends Funcionario{

    public Coordenador(Integer id, String nome, String cpf, Double salarioBruto) {
        super(id, nome, cpf, salarioBruto);
    }

    public Double getSalarioBruto() {
        return super.getSalarioBruto()+(super.getSalarioBruto()*0.20);
    }
}
