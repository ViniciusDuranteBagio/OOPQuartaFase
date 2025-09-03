package Prova;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void calcularBonus() {
        double dezPorCento = salario * 0.1;
        System.out.println("Valor Bonus (10% salario): " + dezPorCento);
    }

    public void exibirInfoFuncionario() {
        System.out.println("Nome: " + nome);
        System.out.println("Salario: " + salario);
    }
}
