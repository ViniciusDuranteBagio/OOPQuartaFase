package exercicios;

class Estagiario extends Funcionario {
    @Override
    public double calcularSalario() {
        return salarioBase * 0.8;
    }
}
