package Aula1007;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.nome = "Aurora";
        animal1.peso = 4.6;
        animal1.altura = 20.1;
        animal1.som = "Miau";

        animal1.emitirSom();
        animal1.pular(10.0);
    }

    static class Animal {
        String nome;
        Double peso;
        Double altura;
        String som;

        public void emitirSom() {
            System.out.println(som);
        }

        public void pular(Double altura) {
            System.out.println("O animal pula a altura de "+altura+" cm.");
        }
    }
}


