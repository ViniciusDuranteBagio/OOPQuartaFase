package main.java.Prova;

public class Gerente extends Funcionario {

    @Override
    double calcularBonus() {
        return salario * 0.20;
    }
}
