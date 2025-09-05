package Prova;

public class Funcionario {

    String nome;
    protected double salario;

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }

    void calcularBonus(){
        double bonus = salario*0.10;
        System.out.println("O seu bonus de 10% é de: R$" + bonus);
    }

}
