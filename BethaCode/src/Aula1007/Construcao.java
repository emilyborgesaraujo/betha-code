package Aula1007;

public class Construcao {
    private Double metragem;
    private String endereco;
    private Integer numQuartos;

    public Construcao(Double metragem, String endereco, Integer numQuartos) {
        this.metragem = metragem;
        this.endereco = endereco;
        this.numQuartos = numQuartos;
    }

    public Double getMetragem() {
        return metragem;
    }

    public void setMetragem(Double metragem) {
        this.metragem = metragem;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumQuartos() {
        return numQuartos;
    }

    public void setNumQuartos(Integer numQuartos) {
        this.numQuartos = numQuartos;
    }
}
