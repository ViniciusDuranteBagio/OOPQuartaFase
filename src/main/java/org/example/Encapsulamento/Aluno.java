package main.java.org.example.Encapsulamento;

import javax.swing.*;

public class Aluno {
    private String nome;
    private int matricula;
    private int nota;

    public  Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota = nota;
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

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        if(nota >= 0 && nota <= 10){
            this.nota = nota;
            if (nota >= 0 && nota<7){
                JOptionPane.showMessageDialog(null, "Não aprovado");
            }
            if(nota >= 7 && nota<=10) {
                JOptionPane.showMessageDialog(null, "Aprovado");
            }
        }else {
            JOptionPane.showMessageDialog(null,"Nota não válida");
        }

    }

    public void exibirAluno(){
       JOptionPane.showMessageDialog(null,"Aluno "+nome+" Matrícula: "+matricula+" Nota: "+nota);

    }
}
