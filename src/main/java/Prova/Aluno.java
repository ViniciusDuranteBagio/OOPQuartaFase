package Prova;

public class Aluno extends Pessoa {

    private int matricula = 24567;

    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e o número da minha matrícula é: " + matricula);
    }
}
