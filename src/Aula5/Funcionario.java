package Aula5;

abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome=nome;
        this.salarioBase=salarioBase;
    }
    public abstract double calcularSalario();

    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Salário: "+calcularSalario());
    }
}
