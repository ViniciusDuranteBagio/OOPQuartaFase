package Heranca;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem) {
        salario += salario * (porcentagem / 100);
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Salário: " + salario);
    }
}
