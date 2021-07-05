package DesafioAula0307;

public class PessoaMain {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Maria";
        pessoa1.altura = 1.56;
        pessoa1.peso = 61.1;

        System.out.println(pessoa1.nome+" tem o imc de "+pessoa1.retornaIMC(pessoa1.altura, pessoa1.peso));
    }
}
