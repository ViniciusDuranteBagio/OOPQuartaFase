package Polimorfismo;

import Polimorfismo.Funcionarios1;

public class Desenvolvedor extends Funcionarios1 {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return salario * 1.2;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();

    }
}
