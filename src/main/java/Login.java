class UsuarioNaoEncontradoException extends Exception {
    public UsuarioNaoEncontradoException(String mensagem) {
        super(mensagem);
    }
}

class SenhaIncorretaException extends Exception {
    public SenhaIncorretaException(String mensagem) {
        super(mensagem);
    }
}

public class Login {
    String[][] usuarios = {
            {"ANa", "120105"},
            {"maria", "senha12"},
            {"admin", "admin"}
    };

    public void autenticar(String loginInformado, String senhaInformada)
            throws UsuarioNaoEncontradoException, SenhaIncorretaException {

        boolean usuarioEncontrado = false;

        for (int i = 0; i < usuarios.length; i++) {
            String login = usuarios[i][0];
            String senha = usuarios[i][1];

            if (login.equals(loginInformado)) {
                usuarioEncontrado = true;
                if (senha.equals(senhaInformada)) {
                    System.out.println("Login realizado com sucesso para o usuário: " + login);
                } else {
                    throw new SenhaIncorretaException("Senha incorreta para o usuário: " + login);
                }
                break;
            }
        }
        if (!usuarioEncontrado) {
            throw new UsuarioNaoEncontradoException("Usuário não encontrado: " + loginInformado);
        }
    }
}
