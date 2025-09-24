package Encapsulamento.pack4;

public class aluno {
    private String nome;
    private int matricula;
    private double nota;

    public aluno(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.nota = 0.0;
    }

    public String getNome() {
        return nome;
    }
    public double getNota() {
        return nota;
    }
    public int getMatricula() {
        return matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setNota(double nota){
        if (nota >= 0 && nota <= 10){
           this.nota = nota;
        }else {
            System.out.println("A nota deve estar entre 0 e 10.");
        }
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void exibirStatus(){
        System.out.println("Aluno: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota: " + nota);
        System.out.println("-----------------------------");
    }
}
