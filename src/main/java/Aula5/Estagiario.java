public class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double calcularSalario() {
        return salarioBase;
    }
}
