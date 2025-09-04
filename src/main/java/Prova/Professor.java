package Prova;

public class Professor extends Pessoa{
   String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }
    public void apresentar(){
        System.out.println("O professor " + nome + " tem " + idade + "anos" +
                "da a disciplina de " + disciplina);
    }
}
