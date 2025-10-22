package Aula6;

class Login {
    private String[][] usuarios;

    public Login() {
        usuarios = new String[][] {
                {"Arthur", "244466666"},
                {"Artur", "123456"},
                {"Hartur", "UmDoisTresQuatroCincoSeis"}
        };
    }

    public void autenticar(String login, String senha) throws UsuarioNaoEncontradoException, SenhaIncorretaException {
        boolean encontrado = false;

        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i][0].equals(login)) {
                encontrado = true;
                if (!usuarios[i][1].equals(senha)) {
                    throw new SenhaIncorretaException("Senha incorreta");
                }
                return;
            }
        }

        if (!encontrado) {
            throw new UsuarioNaoEncontradoException("Usuário não encontrado");
        }
    }
}