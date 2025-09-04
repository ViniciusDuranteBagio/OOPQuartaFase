package Prova;

public class Professor extends Pessoa {

    String disciplina;

    void apresentar() {
        System.out.println("Olá sou, " + nome + ", tenho " + idade + " anos. Ensino a disciplina de " + disciplina + ".");
    }
}
