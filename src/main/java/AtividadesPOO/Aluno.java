package AtividadesPOO;
//Atividade04 EncapsulamentoAula03
public class Aluno {
    private String nome;
    private String matricula;
    private double nota;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = 0.0;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("Erro: A nota deve estar entre 0 e 10!");
        }
    }

    public void exibirStatus() {
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nota: " + nota);
        System.out.println("-----------------------");
    }
}