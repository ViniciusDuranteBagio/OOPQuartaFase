package Polimorfismo;


import Polimorfismo.Funcionarios1;

public  class Gerente1 extends Funcionarios1 {

    public Gerente1(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularSalario() {
        return salario * 1.5;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();

    }
}
