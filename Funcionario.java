abstract class Funcionario {
    String nome;
    double salarioBase;

    Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    abstract double calcularSalario();

    void exibirDados() {
        System.out.println("Nome: " + nome + ", Salário: " + calcularSalario());
    }
}