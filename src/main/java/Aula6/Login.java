package Aula6;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<String, String> usuarios = new HashMap<>();

    public Login() {
        usuarios.put("usuario1", "1234"); // exemplo
        usuarios.put("usuario2", "1234");
    }

    public void fazerLogin() {
        try {
            String login = JOptionPane.showInputDialog("Digite o login:");
            if (!usuarios.containsKey(login)) {
                throw new UsuarioNaoEncontradoException("Usuário não encontrado.");
            }
            String senha = JOptionPane.showInputDialog("Digite a senha:");
            if (!usuarios.get(login).equals(senha)) {
                throw new SenhaIncorretaException("Senha incorreta.");
            }
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
        } catch (UsuarioNaoEncontradoException | SenhaIncorretaException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}