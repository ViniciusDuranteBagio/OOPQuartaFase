package exercicios;

abstract class Funcionario2 {
    String nome;
    double salarioBase;

    public abstract double calcularSalario();

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Base: R$" + salarioBase);
        System.out.println("Salário Final: R$" + calcularSalario());
    }
}
