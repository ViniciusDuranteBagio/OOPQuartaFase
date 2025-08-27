package classe.Exercicio_Aula_2;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota;

    public Aluno (String nome , int matricula){
        this.nome=nome;
        this.matricula=matricula;
        this.nota=0;
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
        if(nota>= 0 && nota <=10) {
            this.nota = nota;
            System.out.println("A nota foi editada " + nota);
        }else {
            System.out.println("A nota precisa estar entre 0 e 10");
        }
    }


    public void ExibirInformacoes(){
        System.out.println("//// DADOS /////");
        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);
        System.out.println("Matricula: " + matricula);
    }
}
