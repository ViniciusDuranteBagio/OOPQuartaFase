package main.java.Prova;

public class Gerente extends Funcionario{

    @Override
    public double calcularBonus() {
        return getSalario() * 0.20 + getSalario();
    }
}
