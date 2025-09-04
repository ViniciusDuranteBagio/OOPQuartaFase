package Prova;

public class Gerente extends Funcionario {

    @Override
    public double calcularBonus() {

        return getSalario(3000.00) * 0.20; // 20%
    }
}
