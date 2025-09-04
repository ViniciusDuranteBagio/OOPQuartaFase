package Prova;

public class Professor  extends Pessoa {
    String disciplina;

    @Override
    void apresentar() {
        System.out.println("\nOlá, sou " + nome + ", tenho " + idade + " anos e leciono " + disciplina + ".");
    }
}

