package Aula3107.HandsOn03;

public class Moto implements Veiculo,Motor{
    @Override
    public String getNome() {
        return "Moto vermelha";
    }

    @Override
    public String getId() {
        return "1";
    }

    @Override
    public String getModelo() {
        return "Modelo 01";
    }

    @Override
    public String getFabricante() {
        return "Fabricante 01";
    }
}
