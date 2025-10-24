package Aula6BrenoLibrelatoManoel;

import javax.swing.*;

public class Login {
    private String[][] usuarios = {
            {"admin", "1234"},
            {"user", "senha"},
            {"joao", "abcd"}
    };

    public void fazerLogin(String usuario, String senha)
            throws UsuarioNaoEncontradoException, SenhaIncorretaException {

        boolean usuarioExiste = false;

        for (String[] user : usuarios) {
            if (user[0].equals(usuario)) {
                usuarioExiste = true;
                if (!user[1].equals(senha)) {
                    throw new SenhaIncorretaException("Senha incorreta!");
                }
                return;
            }
        }

        if (!usuarioExiste) {
            throw new UsuarioNaoEncontradoException("Usuário não encontrado!");
        }
    }

    public static void main(String[] args) {
        Login login = new Login();

        try {
            String usuario = JOptionPane.showInputDialog("Usuário:");
            String senha = JOptionPane.showInputDialog("Senha:");

            login.fazerLogin(usuario, senha);
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");

        } catch (UsuarioNaoEncontradoException | SenhaIncorretaException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }
}