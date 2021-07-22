package Desafio05;

public class FolhaPagamento {

    private Integer id;
    private Funcionario funcionario;
    private String dataPagamento;
    private Descontos descontos;
    private Double salarioLiquido;

    public FolhaPagamento(Integer id, Funcionario funcionario, String dataPagamento, Descontos descontos) {
        this.id = id;
        this.funcionario = funcionario;
        this.dataPagamento = dataPagamento;
        this.descontos = descontos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Descontos getDescontos() {
        return descontos;
    }

    public void setDescontos(Descontos descontos) {
        this.descontos = descontos;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    private void setSalarioLiquido(Double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public void calcular() {
        Double valorIR = 0.0;
        Double valorInss = 0.0;

        if (funcionario.getSalarioBruto() <= 1903.98) {
            System.out.println("Isento IR");
        } else if (funcionario.getSalarioBruto() >= 1903.99 && funcionario.getSalarioBruto() <= 2826.65) {
            valorIR = funcionario.getSalarioBruto()*0.075;
        } else if (funcionario.getSalarioBruto() >= 2826.66 && funcionario.getSalarioBruto() <= 3751.05) {
            valorIR = funcionario.getSalarioBruto()*0.15;
        } else if (funcionario.getSalarioBruto() >= 3751.06 && funcionario.getSalarioBruto() <= 4664.68) {
            valorIR = funcionario.getSalarioBruto()*0.225;
        } else if (funcionario.getSalarioBruto() > 4664.68) {
            valorIR = funcionario.getSalarioBruto()*0.275;
        }

        if (funcionario.getSalarioBruto() <= 1100.00) {
            valorInss = funcionario.getSalarioBruto()*0.075;
        } else if (funcionario.getSalarioBruto() >= 1100.01 && funcionario.getSalarioBruto() <= 2203.48) {
            valorInss = funcionario.getSalarioBruto()*0.09;
        } else if (funcionario.getSalarioBruto() >= 2203.49 && funcionario.getSalarioBruto() <= 3305.22) {
            valorInss = funcionario.getSalarioBruto()*0.12;
        } else if (funcionario.getSalarioBruto() >= 3305.23 && funcionario.getSalarioBruto() <= 6433.57) {
            valorInss = funcionario.getSalarioBruto()*0.14;
        }

        setSalarioLiquido(funcionario.getSalarioBruto()-valorInss-valorIR);
        System.out.println("Salário Bruto: "+funcionario.getSalarioBruto());
        System.out.println("Valor Imposto de Renda: "+ valorIR);
        System.out.println("Valor INSS: "+ valorInss);
        System.out.println("Salário Líquido: "+getSalarioLiquido());
    }

}
