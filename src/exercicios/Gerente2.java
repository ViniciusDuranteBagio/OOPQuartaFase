package exercicios;

class Gerente2 extends Funcionario2 {
    @Override
    public double calcularSalario() {
        return salarioBase * 1.2 + 1000;
    }
}
