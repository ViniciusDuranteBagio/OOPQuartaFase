package Prova;

public class Funcionario {
    String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void calcularBonus() {
        double valor = salario * 10/100;
        System.out.println("Valor com 10%: " + valor);
    }
}
