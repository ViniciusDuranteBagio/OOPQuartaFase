package org.AtividadesPOO3;
//Atividade01 PolimorfismoAula05
public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;
    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public abstract double calcularSalario();

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário Calculado: R$ " + calcularSalario());
        System.out.println("-------------------------");
    }
}
    class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bonus;
    }
}
    class Desenvolvedor extends Funcionario {
    private double adicionalPorHoraExtra;

    public Desenvolvedor(String nome, double salarioBase, double adicionalPorHoraExtra) {
        super(nome, salarioBase);
        this.adicionalPorHoraExtra = adicionalPorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + adicionalPorHoraExtra;
    }
}
    class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase;
    }
}