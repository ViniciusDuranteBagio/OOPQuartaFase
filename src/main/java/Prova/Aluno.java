package Prova;

public class Aluno extends Pessoa {
    public String matricula;

    @Override
    public void apresentar() {
        System.out.println("Olá sou, " + nome + ", e tenho " + idade + " anos. Minha matrícula é " + matricula + ".");
    }
}
