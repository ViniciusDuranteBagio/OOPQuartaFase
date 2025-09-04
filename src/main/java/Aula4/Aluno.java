package Aula4;;

public class Aluno extends Pessoa{
    int matricula;

    public Aluno (String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public void imprimeValor (){
        super.exibeInfo();
        System.out.println("Matrícula: " + matricula);
    }
}
