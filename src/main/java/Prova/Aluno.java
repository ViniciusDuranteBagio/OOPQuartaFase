package Prova;

public class Aluno extends Pessoa {
    int matricula;

    void apresentar(){
        System.out.println("\nOlá, meu nome é " + nome + ", tenho " + idade
                + " anos e minha matrícula é a " + matricula + ".");
    }
}
