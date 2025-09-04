package Prova;

public class Aluno {
    String matricula;
    String nome;
    int idade;

    void apresentar() {
        System.out.println("\nOlá, sou " + nome + ", tenho " + idade + " anos e minha matrícula é " + matricula + ".");
    }
}
