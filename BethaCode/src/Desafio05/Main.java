package Desafio05;

public class Main {
    public static void main(String[] args) {

        Funcionario funcionario1 = FuncionarioBuilder.criaFuncionario("Coordenador");
        FolhaPagamento folha1 = new FolhaPagamento(1,funcionario1,"hoje",null);

        folha1.calcular();
    }
}
