package Aula6;
/*Simule login. Se usuário não existir, mostre mensagem; se senha incorreta, mensagem diferente.
Classes a criar:
Login.
UsuarioNaoEncontradoException.
SenhaIncorretaException.
OBS: Como não temos nenum banco de dados conectado aqui, dentro da classe login podemos
criar uma lista de Logins existentes, e uma unica senha que seria a geral do sistema,
ou uma matriz como um map que pode logins e senhas.
 */

import java.util.HashMap;
import java.util.Map;

public class Login {
    private Map<String, String> usuarios = new HashMap<>();

    public Login() {
        usuarios.put("admin", "senha123");
        usuarios.put("lua", "456senha");
    }

    public void autenticar(String usuario, String senha)
            throws UsuarioNaoEncontradoException, SenhaIncorretaException {
        if (!usuarios.containsKey(usuario))
            throw new UsuarioNaoEncontradoException("Usuário não encontrado.");
        if (!usuarios.get(usuario).equals(senha))
            throw new SenhaIncorretaException("Senha incorreta.");
    }
}
