package Prova;

public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return salario * 0.10;
    }
}
