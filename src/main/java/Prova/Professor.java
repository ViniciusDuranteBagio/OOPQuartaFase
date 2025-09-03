package Prova;

public class Professor extends Pessoa {
    String disciplina;

    @Override
    public void apresentar() {
        System.out.println("Olá, sou " + nome + ", tenho " + idade + " anos e dou aula de " + disciplina + ".");
    }
}
