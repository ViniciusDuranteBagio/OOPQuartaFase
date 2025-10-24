package Atvd_aula6;

public class Login {
    String users ="lumi";
    String senhas ="2468";

    public void log(String usuario, String senha) {
        try {
            if (!usuario.equals(users)){
                throw new UsuarioNaoEncontradoException("Usuário não encontrado.");
            }
            if (!senha.equals(senhas)){
                throw new SenhaIncorretaException("Senha incorreta");
            }
            System.out.println("Login realizado");
     }catch (UsuarioNaoEncontradoException | SenhaIncorretaException e) {
            System.out.println(e.getMessage());
        }
  }
}
