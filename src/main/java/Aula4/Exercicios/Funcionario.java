package Aula4.Exercicios;

public class Funcionario {   protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        this.salario += this.salario * (porcentagem / 100);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " | Salário: " + salario);
    }
}
