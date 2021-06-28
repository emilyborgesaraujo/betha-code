package Desafio03;

import javax.swing.*;

public class Atividade06 {
    public static void main(String[] args) {

        double peso;
        double altura;
        double imc;

        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso (ex: 50.0):"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura (ex: 1.62):"));

        imc = peso/(altura*altura);

        if ((imc >= 16) && (imc<=16.9)) {
            JOptionPane.showMessageDialog(null,"Resultado do imc: "+imc+
                    "\nMuito abaixo do peso");
        } else if ((imc >= 17) && (imc <= 18.4)) {
            JOptionPane.showMessageDialog(null,"Resultado do imc: "+imc+
                    "\nAbaixo do peso");
        } else if ((imc >= 18.5) && (imc <=24.9)) {
            JOptionPane.showMessageDialog(null,"Resultado do imc: "+imc+
                    "\nPeso normal");
        } else if ((imc >= 25) && (imc <= 29.9)) {
            JOptionPane.showMessageDialog(null,"Resultado do imc: "+imc+
                    "\nAcima do peso");
        } else if ((imc >= 30) && (imc <= 34.9)) {
            JOptionPane.showMessageDialog(null,"Resultado do imc: "+imc+
                    "\nObesidade grau I");
        } else if ((imc >= 35) && (imc <= 40)) {
            JOptionPane.showMessageDialog(null,"Resultado do imc: "+imc+
                    "\nObesidade grau II");
        } else if (imc > 40) {
            JOptionPane.showMessageDialog(null,"Resultado do imc: "+imc+
                    "\nObesidade grau III");
        }
    }
}
