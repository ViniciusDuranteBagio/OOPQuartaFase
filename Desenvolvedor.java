class Desenvolvedor extends Funcionario {
    Desenvolvedor(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    double calcularSalario() {
        return salarioBase; // Salário base
    }
}