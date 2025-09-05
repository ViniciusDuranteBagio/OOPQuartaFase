package Prova;

public class Funcionario {
    private String nome;
    private double salario;
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void calcularBonus(){
        System.out.println("O bônus do funcionário de: R$" + getSalario() * 0.1);
    }
}
