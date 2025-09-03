package Prova;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);

    }

    @Override
    public void calcularBonus() {
        double dezPorCento = salario * 0.2;
        System.out.println("Valor Bonus (20% salario): " + dezPorCento);
    }
}