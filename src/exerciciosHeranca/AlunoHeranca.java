public class AlunoHeranca extends PessoaHeranca{
    int matricula;

    public AlunoHeranca(String nome, int idade, int matricula) {
    super(nome,idade);
    this.matricula=matricula;
    }
}
