package Prova;

public class Aluno extends Pessoa {

    public int matricula;


    @Override
    public void apresentar() {
        System.out.println("Olá, sou " + nome + ", tenho " + idade + " anos e minha matrícula é " + matricula + ".");
    }
}


