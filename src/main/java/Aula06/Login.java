package Aula06;

import java.util.Map;
import java.util.HashMap;

public class Login {
    private final Map<String, String> users = new HashMap<>();

    public Login() {
        users.put("renan", "1234");
        users.put("admin", "admin");
        users.put("joao", "senha");
    }

    public void autenticar(String usuario, String senha)
            throws UsuarioNaoEncontradoException, SenhaIncorretaException {

        if (!users.containsKey(usuario)) throw new UsuarioNaoEncontradoException("Usuario não encontrado.");
        if (!users.get(usuario).equals(senha)) throw new SenhaIncorretaException("Senha incorreta.");
    }
}
