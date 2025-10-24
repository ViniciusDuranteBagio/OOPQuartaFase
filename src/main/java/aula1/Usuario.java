package aula1;

public class Usuario {  public String nome;
    public String senha;

    public boolean verificarSenha(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }
}

