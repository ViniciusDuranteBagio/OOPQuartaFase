package Prova;

public class Gerente extends Funcionario {
    double salario1;
    @Override
    double calcularBonus() {
        return salario1 * 0.20;

    }
}