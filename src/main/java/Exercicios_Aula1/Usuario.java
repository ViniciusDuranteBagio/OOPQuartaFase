package Exercicios_Aula1;

public class Usuario {
    String nome;
    String senha;

    public void verificarSenha( String senhaDigitada) {
        if (senhaDigitada == senha) {
            System.out.println("A senha está correta!");
        } else {
            System.out.println("A senha está incorreta!");
        }
    }
}
