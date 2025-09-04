package Prova;

public class Pessoa {

    String nome;
    int idade;

    void Apresentar() {
        System.out.println("\nOlá, meu nome é " + nome);
        System.out.println(" e tenho " + idade + " anos");
    }

    void apresentar() {


        System.out.println("\nOlá, sou " + nome + ", e tenho " + idade + " anos.");
    }
}


