package Prova;

public class Gerente extends Funcionario{
    public Gerente (String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        double valor = salario * 20/100;
        System.out.println("Valor com 20%: " + valor);
    }
}
