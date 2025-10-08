package Aula6;

import javax.swing.*;

public class Pessoa {

    public void definirIdade() {
        boolean idadeValida = false;

        while (!idadeValida) {
            try {
                int idade = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira sua idade:"));

                if (idade < 0) {
                    throw new IdadeInvalidaException("A idade não pode ser negativa.");
                }

                System.out.println("Idade cadastrada: " + idade);
                idadeValida = true;

            } catch (IdadeInvalidaException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
            }
        }
    }
}