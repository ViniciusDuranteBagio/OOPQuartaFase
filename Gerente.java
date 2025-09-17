class Gerente extends Funcionario {
    Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    double calcularSalario() {
        return salarioBase * 1.2; // +20%
    }
}