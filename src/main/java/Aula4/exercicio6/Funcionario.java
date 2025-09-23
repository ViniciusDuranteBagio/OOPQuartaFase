package Aula4.exercicio6;

public class Funcionario {
    public String nome;
    public double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        salario += salario * (porcentagem / 100);
    }
}
