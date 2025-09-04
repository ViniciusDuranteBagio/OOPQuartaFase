package Prova;

public class Aluno extends Pessoa {

    String matricula;

    void apresentar() {
        System.out.println("Olá sou, " + nome + ", e tenho " + idade + " anos. Minha matrícula é " + matricula + ".");
    }
}