package aula06;

import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<String, String> usuarios = new HashMap<>();

    public Login() {
        usuarios.put("admin", "12345");
        usuarios.put("Mateus", "Abcd");
    }

    public void autenticar(String usuario, String senha)
            throws UsuarioNaoEncontradoException, SenhaIncorretaException {
        if (!usuarios.containsKey(usuario)) {
            throw new UsuarioNaoEncontradoException("Usuário não encontrado!");
        }
        if (!usuarios.get(usuario).equals(senha)) {
            throw new SenhaIncorretaException("Senha incorreta!");
        }
        System.out.println("Login bem-sucedido!");
    }
}

