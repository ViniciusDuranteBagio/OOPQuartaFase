package classe.src.Exercicio_Aula_1;

public class Login{

private String nome;
private String senha;

public void Usuario(String nome, String senha) {
    this.nome = nome;
    this.senha = senha;
}

public boolean verificarSenha(String senhaDigitada) {
    return this.senha.equals(senhaDigitada);

    }
}