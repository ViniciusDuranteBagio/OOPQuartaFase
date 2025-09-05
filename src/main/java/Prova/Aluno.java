package Prova;

public class Aluno extends Pessoa {
    int matricula;

    void apresentar() {
        super.apresentar();
        System.out.println("Matrícula: " + matricula);

    }
}
