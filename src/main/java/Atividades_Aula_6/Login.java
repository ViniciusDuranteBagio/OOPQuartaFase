package Atividades_Aula_6;

import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<String, String> usuarios;
    private String senhaGeral;

    public Login() {
        usuarios = new HashMap<>();
        // Example users
        usuarios.put("usuario1", "senha1");
        usuarios.put("usuario2", "senha2");
        senhaGeral = "senhaGeral";
    }

    public void autenticar(String usuario, String senha) throws UsuarioNaoEncontradoException, SenhaIncorretaException {
        if (!usuarios.containsKey(usuario)) {
            throw new UsuarioNaoEncontradoException("Usuário não encontrado");
        }
        if (!usuarios.get(usuario).equals(senha)) {
            throw new SenhaIncorretaException("Senha incorreta");
        }
    }

    public static void main(String[] args) {
        Login login = new Login();
        try {
            login.autenticar("usuario1", "senha1");
            System.out.println("Login bem-sucedido");
            login.autenticar("usuario3", "senha1");
        } catch (UsuarioNaoEncontradoException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (SenhaIncorretaException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
