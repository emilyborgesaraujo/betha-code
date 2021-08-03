package Aula3107;

public class SecretariaAdministrativa extends Secretaria{

    public SecretariaAdministrativa(String nome, Double salario) {
        super(nome, salario);
    }

    @Override
    public Double getBonificacao() {
        return getSalario()*1.09;
    }
}
