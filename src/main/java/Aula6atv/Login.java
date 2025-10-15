package Aula6atv;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Login {
    private Map<String, String> usuarios;
    public Login() {
        usuarios = new HashMap<>();

        usuarios.put("admin", "1234");
        usuarios.put("lara", "senha123");
        usuarios.put("joao", "abc123");
    }

    public void autenticar(String usuario, String senha)
            throws UsuarioNaoEncontradoException, SenhaIncorretaException {

        if (!usuarios.containsKey(usuario)) {
            throw new UsuarioNaoEncontradoException("Usuário não encontrado!");
        }

        String senhaCorreta = usuarios.get(usuario);
        if (!senhaCorreta.equals(senha)) {
            throw new SenhaIncorretaException("Senha incorreta!");
        }

        System.out.println("✅ Login realizado com sucesso! Bem-vindo(a), " + usuario + "!");
    }
}
