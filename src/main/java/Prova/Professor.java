package Prova;

public class Professor extends Pessoa {
    String disciplina;
    public Professor(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina=disciplina;
    }
    @Override
    public void apresentar(){
        System.out.println("Ola, meu nome é "+nome+", tenho "+idade+" anos e sou professor de "+disciplina);
    }
}
