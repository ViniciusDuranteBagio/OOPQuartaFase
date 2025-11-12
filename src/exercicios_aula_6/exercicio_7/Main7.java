package exercicios_aula_6.exercicio_7;

import javax.swing.*;

public class Main7 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();

        try {
            String entrada = JOptionPane.showInputDialog("Digite o nome do usuário:");
            if (entrada == null) {
                JOptionPane.showMessageDialog(null, "Programa encerrado pelo usuário");
                return;
            }

            usuario.setNome(entrada);

            JOptionPane.showMessageDialog(null, "Nome cadastrado com sucesso: " + usuario.getNome());

        } catch (NomeInvalidoException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
