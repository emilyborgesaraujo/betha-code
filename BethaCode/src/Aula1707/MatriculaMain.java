package Aula1707;

public class MatriculaMain {
    public static void main(String[] args) {
        Matricula matricula1 = MatriculaBuilder.criaMatricula("FUNCIONARIO");
        matricula1.setSalario(1000.0);
        System.out.println(matricula1.getSalario());

        Matricula matricula2 = MatriculaBuilder.criaMatricula("ESTAGIARIO");
        matricula2.setSalario(1000.0);
        System.out.println(matricula2.getSalario());
    }
}
