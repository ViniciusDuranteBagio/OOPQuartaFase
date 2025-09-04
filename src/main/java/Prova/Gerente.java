package Prova;

public class Gerente extends Funcionario{
    protected Gerente(String nome, double salario) {
        super(nome, salario);

    }
    @Override
    protected void calcularBonus() {
        salario = salario * 0.20;
        System.out.println("20% do salario do gerente é " + salario);
    }
}
