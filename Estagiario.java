class Estagiario extends Funcionario {
    Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    double calcularSalario() {
        return salarioBase * 0.8; // -20%
    }
}