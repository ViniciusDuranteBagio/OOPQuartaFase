package Prova;

public class Funcionario {
    protected String nome;
    protected double salario;

    // Construtor
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus(){
        double bonus;
        bonus = (salario/100) * 10;
        return bonus;
    }
}
