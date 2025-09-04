package Prova;

public class Professor extends Pessoa{

    private String disciplina;

    public Professor(String nome, Integer idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void apresentar(){
        System.out.println("Olá, meu nome é " + getNome() + ", tenho " + getIdade() + " anos e sou professor(a) de " + getDisciplina());
    }
}
