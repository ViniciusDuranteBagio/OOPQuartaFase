package Exercs;

public class Usuario {

    String nomeUser;
    String senhaUser;

    void verificarSenha(String senhaDigitada) {
        if (senhaDigitada == senhaUser ) {
            System.out.println("Senha correta");
        }
        else {
            System.out.println("Senha incorreta");
        }
    }
}