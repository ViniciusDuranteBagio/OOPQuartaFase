package Aula5.Exercicios;

public abstract class Funcionario {
    public String nome;
    public double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public void exibirDados() {
        System.out.println("Nome: " + nome + " | Salário final: R$" + calcularSalario());
    }
}
