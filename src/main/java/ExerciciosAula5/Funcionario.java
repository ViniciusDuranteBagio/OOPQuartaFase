package ExerciciosAula5;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salário Base: R$" + this.salarioBase);
        System.out.println("Salário Final: R$" + this.calcularSalario());
    }
}
