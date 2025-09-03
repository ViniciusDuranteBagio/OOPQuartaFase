package Prova;

public class Main_Pessoa {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.idade=19;
        pessoa.nome="Davi";
        pessoa.apresentar();

        Aluno aluno= new Aluno();
        aluno.nome="Davi";
        aluno.idade=19;
        aluno.matricula=11122;
        aluno.apresentar();

        Professor prof = new Professor();
        prof.nome="Davi";
        prof.idade=20;
        prof.diciplina="POO";

    }
}
