package Prova;

public class Professor extends Pessoa {
    String disciplina;

    void apresentar(){
        System.out.println("\nOlá, meu nome é " + nome + ", tenho " + idade + " anos e ensino a disciplina de " + disciplina + ".");
    }

}
