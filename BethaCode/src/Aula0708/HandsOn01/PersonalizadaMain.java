package Aula0708.HandsOn01;

public class PersonalizadaMain {
    public static void main(String[] args) throws Exception {
        recebeValor(8);
    }

    //teste git
    //teste git2

    public static void recebeValor(int valor) {
        try {
            if (valor > 10) {
                ValorMaiorQueOPermitidoException vmaior = new ValorMaiorQueOPermitidoException("Valor maior que 10");
                throw vmaior;
            } else if (valor < 3) {
                ValorMaiorQueOPermitidoException vmenor = new ValorMaiorQueOPermitidoException("Valor menor que 3");
                throw vmenor;
            } else {
                System.out.println("Valor válido!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
