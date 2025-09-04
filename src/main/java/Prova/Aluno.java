package main.java.Prova;

public class Aluno extends Pessoa {
    String matricula;

    @Override
    void apresentar() {
        System.out.println("Olá, sou " + nome + ", tenho " + idade +
                " anos e minha matrícula é " + matricula + ".");
    }
}