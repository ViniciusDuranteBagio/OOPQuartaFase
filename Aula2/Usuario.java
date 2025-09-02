package Aula2;
/*Criando um sistema de login
Crie uma classe Usuario com os atributos nome e senha.
Crie um metodo verificarSenha(String senhaDigitada) que verifica se a senha digitada é correta.
Teste o metodo instanciando um usuário e verificando a senha.*/

public class Usuario {
    String nome;
    String senha;

    public Usuario(String nome, String senha){
        this.nome = nome;
        this.senha = senha;
    }
    public boolean verificarSenha(String senhaDigitada){
        return senha.equals(senhaDigitada);
    }
}
