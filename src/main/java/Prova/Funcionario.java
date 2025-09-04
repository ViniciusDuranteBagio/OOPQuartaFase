package Prova;

public class Funcionario {
    private String nome;
    private double salario;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularBonus() {
        return salario * 0.10;
    }
}