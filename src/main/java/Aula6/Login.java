import java.util.HashMap;
public class Login {
    private HashMap<String, String> usuarios = new HashMap<>();
    public Login() {
        usuarios.put("joao", "123");
        usuarios.put("maria", "senha");
        usuarios.put("admin", "admin");
    }
    public void logar(String user, String senha)
            throws UsuarioNaoEncontradoException, SenhaIncorretaException {
        if (!usuarios.containsKey(user))
            throw new UsuarioNaoEncontradoException("Usuário não encontrado!");
        if (!usuarios.get(user).equals(senha))
            throw new SenhaIncorretaException("Senha incorreta!");
    }
}