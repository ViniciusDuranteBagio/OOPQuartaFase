package Aula6BrenoLibrelatoManoel;

import javax.swing.*;

public class Pessoa {
    private int idade;

    public void setIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0) throw new IdadeInvalidaException("Idade não pode ser negativa!");
        this.idade = idade;
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
            p.setIdade(idade);
            JOptionPane.showMessageDialog(null, "Idade válida: " + idade);
        } catch (IdadeInvalidaException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Digite um número válido!");
        }
    }
}