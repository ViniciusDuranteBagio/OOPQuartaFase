import javax.swing.*;

public class Aluno {
    private String nome;
    private int matricula;
    private double nota;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = 0;
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
        if (nota < 0 || nota > 10) {
            JOptionPane.showMessageDialog(null, "Valor de nota inválido, insira uma nota válida");
        } else {
            this.nota = nota;
        }
    }

    public void exibirStatus() {
        JOptionPane.showMessageDialog(null, "O aluno " + nome + " de matrícula " + matricula
                + " ficou com a nota " + nota);
    }
}

