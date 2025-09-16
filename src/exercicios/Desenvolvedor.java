package exercicios;

class Desenvolvedor extends Funcionario {
    @Override
    public double calcularSalario() {
        return salarioBase * 1.5;
    }
}
