package Prova;

public class Pessoa {
    String nome;
    int idade;

    public void apresentar() {
        System.out.println("Olá sou " + nome + ", e tenho " + idade + " anos.");
    }
}
public class Aluno extends Pessoa {
    String matricula;

    @Override
    public void apresentar() {
        System.out.println("Olá sou " + nome + ", tenho " + idade + " anos, e minha matrícula é " + matricula + ".");
    }
}
}
