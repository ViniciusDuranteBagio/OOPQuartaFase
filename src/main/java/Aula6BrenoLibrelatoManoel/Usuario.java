package Aula6BrenoLibrelatoManoel;

import javax.swing.*;

public class Usuario {
    private String nome;

    public void setNome(String nome) throws NomeInvalidoException {
        if (nome == null || nome.trim().isEmpty()) {
            throw new NomeInvalidoException("Nome não ficar em branco");
        }
        this.nome = nome;
    }

    public static void main(String[] args) {
        Usuario user = new Usuario();

        try {
            String nome = JOptionPane.showInputDialog("Digite seu nome:");
            user.setNome(nome);
            JOptionPane.showMessageDialog(null, "Nome válido: " + nome);

        } catch (NomeInvalidoException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}