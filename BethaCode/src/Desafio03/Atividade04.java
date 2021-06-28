package Desafio03;

import javax.swing.*;

public class Atividade04 {
    public static void main(String[] args) {
        String nome;
        int idade;

        nome = JOptionPane.showInputDialog("Digite o seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade:"));
        JOptionPane.showMessageDialog(null,"Seu nome é "+nome+" e você tem "
                +idade+" anos de idade");
    }
}
