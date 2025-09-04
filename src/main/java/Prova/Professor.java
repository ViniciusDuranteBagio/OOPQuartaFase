package Prova;

public class Professor extends Pessoa{
    String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        System.out.println("Olá, sou " + nomePessoa + ", tenho " + idadePessoa + " anos e ministro a disciplina de " + disciplina + ". (Mesmo odiando ela... quero férias)");
    }    
}
