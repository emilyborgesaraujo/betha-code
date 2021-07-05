package Aula0307;

public class Corrida {
    public static void main(String[] args) {

        CarroCorrida carroEquipeVelocidade = new CarroCorrida();
        CarroCorrida carroEquipeTrapaceiros = new CarroCorrida();

        Piloto pilotoEquipeVelocidade = new Piloto();
        Piloto pilotoEquipeTrapaceiros = new Piloto();

        pilotoEquipeVelocidade.nome = "Piloto 1";
        pilotoEquipeVelocidade.idadePiloto = 25;
        pilotoEquipeVelocidade.habilidade = 75;

        pilotoEquipeTrapaceiros.nome = "Piloto 2";
        pilotoEquipeTrapaceiros.idadePiloto = 27;
        pilotoEquipeTrapaceiros.habilidade = 65;

        carroEquipeVelocidade.piloto = pilotoEquipeVelocidade;
        carroEquipeTrapaceiros.piloto = pilotoEquipeTrapaceiros;

        carroEquipeVelocidade.numeroIdentificacao = 1;
        carroEquipeTrapaceiros.numeroIdentificacao = 2;

        carroEquipeVelocidade.ligar();
        carroEquipeTrapaceiros.ligar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiros.acelerar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiros.acelerar();

        carroEquipeVelocidade.acelerar();
        carroEquipeTrapaceiros.velocidadeAtual = 200.0;

        System.out.println(carroEquipeVelocidade.velocidadeAtual);
        System.out.println(carroEquipeTrapaceiros.velocidadeAtual);
    }

    static class CarroCorrida {

        Integer numeroIdentificacao;
        Double velocidadeAtual = 0.0;
        Double velocidadeMaxima = 100.0;
        Piloto piloto;

        void ligar() {
            System.out.println("VRUUUUUMMMMMMMMMM");
        }

        void desligar() {
            System.out.println("MMMmmmmmmmm.....");
        }

        void acelerar() {
            velocidadeAtual += 10 + piloto.habilidade*0.1;
            if (velocidadeAtual > velocidadeMaxima) {
                velocidadeAtual = velocidadeMaxima;
            }
        }

        void frear(Integer intensidadeFreada) {
            if (intensidadeFreada > 100) {
                intensidadeFreada = 100;
            } else if (intensidadeFreada < 0) {
                intensidadeFreada = 0;
            }

            velocidadeAtual -= intensidadeFreada*0.25;

            if(velocidadeAtual < 0) {
                velocidadeAtual = 0.0;
            }
        }

    }

    static class Piloto {

        String nome;
        Integer idadePiloto;
        Integer habilidade;

    }
}
