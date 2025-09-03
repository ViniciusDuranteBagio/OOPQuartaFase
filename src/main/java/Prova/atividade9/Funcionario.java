package atividade9;

public class Funcionario {
    public String nome;
    public double salario;

    public void calcularBonus() {
        double bonus = salario * 0.10;
        System.out.println("O " + nome + " receberá o bônus de " + bonus);
    }
}
