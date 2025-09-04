package Prova;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        double bonus;
        bonus = (salario/100) * 20;
        return bonus;
    }
}
