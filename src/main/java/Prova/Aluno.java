package main.java.Prova;

public class Aluno extends Pessoa {
    private int matricula;

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }


    @Override
    public void Apresentar() {
        System.out.println("Olá meu nome é " + nome + " e tenho " + idade + " anos e minha matrícula é " + matricula + ".");
    }
}
