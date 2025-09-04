package Prova;

public class Gerente extends Funcionario{
@Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}

