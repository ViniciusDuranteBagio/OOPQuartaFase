package exercicio_3;

import javax.swing.*;

public class Main3 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        try {
            String entrada = JOptionPane.showInputDialog("Digite a idade:");

            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário");
                return;
            }

            int idade = Integer.parseInt(entrada);

            pessoa.setIdade(idade);

            JOptionPane.showMessageDialog(null, "Idade cadastrada com sucesso: " + pessoa.getIdade() + " anos");

        } catch (IdadeInvalidaException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números inteiros");
        }
    }
}