package Aula3.Atividade;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula,double nota){
        this.matricula=matricula;
        this.nome=nome;
        this.nota=nota;

    }
    public Aluno(String nome, int matricula){
        this.matricula=matricula;
        this.nome=nome;
        this.nota=0.0;

    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNota(double nota) {
        if (nota >= 0 && nota <= 10) {
            this.nota = nota;
        } else {
            System.out.println("A nota deve estar entre 0 e 10!");
        }

    }
    public void exibirStatus(){
        System.out.println("Nome: "+nome+"\nMatrícula: "+matricula+"\nNota: "+nota);
    }


}
