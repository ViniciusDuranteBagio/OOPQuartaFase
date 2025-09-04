package Prova;

public class Professor extends Pessoa {

    private String disciplina = "Programação orientada a objetos |";
    String nome = "Durante";
    int idade = 18;
    void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e eu dou aula de " + disciplina);
    }
}
