package DesafioAula0307;

public class Pessoa {

    String nome;
    String cpf;
    String rg;
    Double altura;
    Double peso;
    String dataNascimento;
    String nomePai;
    String nomeMae;

    public Double retornaIMC(Double altura, Double peso) {
        Double imc = peso/(altura*altura);

        return imc;
    }
}
