package atividade9;

public class Funcionario {
    public String nome;
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void calcularBonus() {
        double bonus = salario * 0.10;
        System.out.println("O " + nome + " receberá o bônus de " + bonus);
    }
}
