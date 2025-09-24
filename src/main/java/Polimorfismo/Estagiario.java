package Polimorfismo;

public class Estagiario extends Funcionarios1 {
    public Estagiario(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return salario * 1.1;
    }
    @Override
    public void exibirDados() {
        super.exibirDados();


    }
}
