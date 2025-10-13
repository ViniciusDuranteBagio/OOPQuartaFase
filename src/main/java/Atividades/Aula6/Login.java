package Atividades.Aula6;

import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<String, String> usuarios;

    public Login() {
        usuarios = new HashMap<>();
        usuarios.put("usuario1", "senha123");
        usuarios.put("usuario2", "senha123");
        usuarios.put("usuario3", "senha123");
    }

    public void autenticar(String usuario, String senha) throws UsuarioNaoEncontradoException, SenhaIncorretaException {
        if (!usuarios.containsKey(usuario)) {
            throw new UsuarioNaoEncontradoException("Erro: Usuário não encontrado.");
        }

        if (!usuarios.get(usuario).equals(senha)) {
            throw new SenhaIncorretaException("Erro: Senha incorreta.");
        }
        System.out.println("Login realizado com sucesso!");
    }
}
