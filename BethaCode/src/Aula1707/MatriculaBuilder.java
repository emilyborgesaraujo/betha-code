package Aula1707;

public class MatriculaBuilder {

    public static Matricula criaMatricula(String tipo) {
        if (tipo.equals("FUNCIONARIO")) {
            return new Funcionario();
        } else {
            return new Estagiario();
        }
    }
}
