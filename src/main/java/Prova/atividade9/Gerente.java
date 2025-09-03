package atividade9;

public class Gerente extends Funcionario{

    @Override
    public void calcularBonus() {
        double bonus = salario * 0.20;
        System.out.println("O " + nome + " receberá o bônus de " + bonus);
    }
}


