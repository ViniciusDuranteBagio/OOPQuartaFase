package Aula4;

public class Aluno extends Pessoa{
    private String matricula;

    public Aluno(){
        super();
    }

    public Aluno(String nome, int idade, String matricula){
        super(nome, idade);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    @Override
    public void exibirInformacoes(){
        System.out.println("        INFORMAÇÕES DO ALUNO        ");
        super.exibirInformacoes();
        System.out.println("Matrícula: " + this.matricula);
    }
}
