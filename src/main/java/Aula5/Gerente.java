public class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double calcularSalario() {
        return salarioBase + 3000;
    }
}
