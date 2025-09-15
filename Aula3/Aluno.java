package Aula3;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota;
    public Aluno (String nome, int matricula){
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
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        if(nota >= 0 || nota <= 10){
            this.nota = nota;
        }else{
            System.out.println("Nota inválida. Por favor preencha com uma nota entre 0 e 10.");
        }
    }
    public void exibirStatus(){
        System.out.println("            STATUS            \nNome: " + this.nome + "\nMatrícula: " + this.matricula + "\nNota: " + this.nota);
    }
}
