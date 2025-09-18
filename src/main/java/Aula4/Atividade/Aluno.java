package Aula4.Atividade;

public class Aluno extends Pessoa{
    private String matricula;

    public Aluno() {
        super();
    }

    public Aluno(String nome, int idade, String matricula) {
        super(nome,idade);
        this.matricula=matricula;

    }

    public String getMatriciula() {
      return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula=matricula;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Matrícula: " + this.matricula);
    }
}
