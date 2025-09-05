package Prova;

public class Professor extends Pessoa {
    public String disciplina;

    @Override
    public void apresentar() {
        System.out.println("Olá sou, " + nome + ", e tenho " + idade + " anos. Ensino " + disciplina + ".");
    }
}
