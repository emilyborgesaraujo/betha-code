package Desafio05;

public class FuncionarioBuilder {

    public static Funcionario criaFuncionario(String tipo) {
        if (tipo.equals("Estagiário")) {
            return new Estagiario(1,"Maria","100",1000.00);
        } else if (tipo.equals("Analista")) {
            return new Analista(2,"João","101",2000.00);
        } else if (tipo.equals("Arquiteto")) {
            return new ArqSoftware(3,"Joana","102",3000.00);
        } else {
            return new Coordenador(4,"Pedro","103",4000.00);
        }
    }
}
