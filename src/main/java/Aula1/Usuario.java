package Aula1;

public class Usuario {
    String nome;
    String senha;

    public String verificarSenha(String senhaDigitada){
        if(senhaDigitada == senha){
            System.out.println("Login efetuado!");
        } else {
            System.out.println("Senha incorreta!");
        }
        return senhaDigitada;
    }

}
