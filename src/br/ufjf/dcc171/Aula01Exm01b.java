package br.ufjf.dcc171;

import javax.swing.JOptionPane;

public class Aula01Exm01b {
    public static void main(String[] args) {
        try {
        Integer n1;
        Integer n2;
        String sn1 = JOptionPane.showInputDialog("Digite o primeiro número");
        String sn2 = JOptionPane.showInputDialog("Digite o segundo número");
        n1 = Integer.parseInt (sn1);
        n2 = Integer.parseInt(sn2);
        JOptionPane.showMessageDialog(null, "A soma de " + n1 + "+" + n2 + " é " + (n1+n2), "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
        catch (NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null, "Digite um número inteiro para as duas opções", "Entrada inválida", JOptionPane.ERROR_MESSAGE);
        }
    }
}
