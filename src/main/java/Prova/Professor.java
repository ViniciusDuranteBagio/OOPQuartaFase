package Prova;

public class Professor extends Pessoa{
    String disciplina;

    @Override
    public void apresentar() {
        System.out.println("Olá, meu nome é " + nome + ", tenho " + idade + " anos e ministro a disciplina " + disciplina + ".");
    }
}
