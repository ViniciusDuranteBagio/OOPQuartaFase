package Prova;

public class Professor extends Pessoa {

    public String disciplina;

    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos de idade e dou aula de " + disciplina + ".");
    }
}
