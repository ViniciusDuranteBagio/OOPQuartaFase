package Prova;

public class Gerente extends Funcionario{

    public Gerente (String nome, double salario){
        super(nome, salario);
    }

    @Override
    void calcularBonus() {
        double bonus = salario*0.20;
        System.out.println("O seu bonus de 20% é de: R$" + bonus);
    }
}
