package Aula6;

import javax.swing.*;

public class Usuario {
    public void cadastrarNome() {
        boolean valido = false;
        while (!valido) {
            try {
                String nome = JOptionPane.showInputDialog("Digite seu nome:");
                if (nome == null || nome.trim().isEmpty()) {
                    throw new NomeInvalidoException("Nome não pode ser vazio ou nulo.");
                }
                JOptionPane.showMessageDialog(null, "Nome cadastrado: " + nome);
                valido = true;
            } catch (NomeInvalidoException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }
}