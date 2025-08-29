package ExercsEncapsulamento;

public class Aluno2 {
    private String nome;
    private int matricula;
    private double nota = 0;

    public Aluno2(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome(){
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setNota(double nota) {
        if (nota >= 0) {
            this.nota = nota;
        }
        else {
            System.out.println("ERRO!A NOTA PRECISA SER MAIOR QUE 0!");
        }
    }

    void exibirStatus () {
        System.out.println("Aluno: " + nome + "\nMatricula: " + matricula + "\nNota: " + nota);
    }

}
