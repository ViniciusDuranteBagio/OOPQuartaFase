package exercicios_10;

import javax.swing.*;

public class Main10 {
    public static void main(String[] args) {
        Login sistemaLogin = new Login();

        try {
            String login = JOptionPane.showInputDialog("Digite o nome de usuário:");
            if (login == null) {
                JOptionPane.showMessageDialog(null, "Login cancelado pelo usuário.");
                return;
            }

            String senha = JOptionPane.showInputDialog("Digite a senha:");
            if (senha == null) {
                JOptionPane.showMessageDialog(null, "Login cancelado pelo usuário.");
                return;
            }

            sistemaLogin.autenticar(login, senha);

            JOptionPane.showMessageDialog(null, "Login realizado com sucesso");

        } catch (UsuarioNaoEncontradoException | SenhaIncorretaException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
