package Prova;

public class Professor extends Pessoa3 {
    String disciplina;


    public void apresentar() {
        System.out.println("Olá, sou " + nome + ", tenho " + idade +
                " anos e dou aula de " + disciplina + ".");
    }
}

