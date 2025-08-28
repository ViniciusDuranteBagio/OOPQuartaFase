package org.example.aula01;


public class Usuario {
    String nome;
    String senha = "1234";

    public void verificarSenha(String senhaDigitada) {
        if (senhaDigitada.equals(this.senha)) {
            System.out.println("Senha digitada esta correta!");
        } else {
            System.out.println("Senha digitada nao correta!");
        }
    }
}