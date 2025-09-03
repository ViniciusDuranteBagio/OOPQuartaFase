package Prova;

public class Aluno extends Pessoa {
    public String matricula;

    public Aluno(String Nome, int Idade, String matricula) {
        super.Nome = Nome;
        super.Idade = Idade;
        this.matricula = matricula;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, sou " + Nome + ", tenho " + Idade + " anos e minha matrícula é " + matricula + ".");
    }
}
