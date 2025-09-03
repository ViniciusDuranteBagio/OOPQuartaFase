package Prova;

public class AlunoHeranca extends PessoaHeranca {
    String matricula;


    public AlunoHeranca (String nome, int idade, String matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Matrícula: " + matricula);
    }
}
