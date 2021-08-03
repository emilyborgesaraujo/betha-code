package Desafio06.model;

import java.math.BigDecimal;

public class Produto implements Vendavel{

    private Long id;
    private String descricao;
    private BigDecimal altura;
    private BigDecimal largura;
    private BigDecimal valorUnitario;

    public Produto(Long id, String descricao, BigDecimal altura, BigDecimal largura, BigDecimal valorUnitario) {
        this.id = id;
        this.descricao = descricao;
        this.altura = altura;
        this.largura = largura;
        this.valorUnitario = valorUnitario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public BigDecimal getLargura() {
        return largura;
    }

    public void setLargura(BigDecimal largura) {
        this.largura = largura;
    }

    @Override
    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
}
