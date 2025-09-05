package Prova;

public class Funcionario {

    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return this.salario * 0.10;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }
}
