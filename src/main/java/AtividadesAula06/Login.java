package AtividadesAula06;

import java.util.ArrayList;
import java.util.List;

public class Login {

    private List<String> usuarios = new ArrayList<>();
    private List<String> senhas = new ArrayList<>();

    public Login() {
        usuarios.add("Barbara");
        senhas.add("babs123");

        usuarios.add("joao");
        senhas.add("4568");

        usuarios.add("fulan");
        senhas.add("adafifm");

    }

    public void autenticar(String usuario, String senha) throws UsuarioNaoEncontradoException, SenhaIncorretaException {

        int indice = usuarios.indexOf(usuario);

        if (indice == -1) {
            throw new UsuarioNaoEncontradoException("Usuario: " + usuario + " não encontrado");

        }

        if (!senhas.get(indice).equals(senha)) {
            throw new SenhaIncorretaException("Senha incorreta de " + usuario);
        }
        System.out.println("login realizado. bem vindo " + usuario);
    }
}
