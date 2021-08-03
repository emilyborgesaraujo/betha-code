package Aula3107.HandsOn02;

public class Triangulo implements FiguraGeometrica{

    private int base;
    private int altura;
    private int ladoA;
    private int ladoB;
    private int ladoC;

    public Triangulo(int base, int altura, int ladoA, int ladoB, int ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    @Override
    public String getNome() {
        return "Triângulo";
    }

    @Override
    public int getArea() {
        return (base*altura)/2;
    }

    @Override
    public int getPerimetro() {
        return ladoA+ladoB+ladoC;
    }
}
