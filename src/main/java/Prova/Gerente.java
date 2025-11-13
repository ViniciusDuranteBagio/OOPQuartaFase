package Prova;

public class Gerente extends Funcionario{
    public Gerente (String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void calcBonus() {
        System.out.println("bonus de: " + getSalario() * 0.2);
    }
}
