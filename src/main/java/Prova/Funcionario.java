package Prova;

public class Funcionario {
    String nome;
    double salario;

    public double calcularBonus() {
        return salario * 0.10;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
        System.out.println("Bônus: R$ " + calcularBonus());
    }
}
