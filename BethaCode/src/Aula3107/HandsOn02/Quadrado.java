package Aula3107.HandsOn02;

public class Quadrado implements FiguraGeometrica{

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public String getNome() {
        return "Quadrado";
    }

    @Override
    public int getArea() {
        return lado*lado;
    }

    @Override
    public int getPerimetro() {
        return lado*4;
    }
}
