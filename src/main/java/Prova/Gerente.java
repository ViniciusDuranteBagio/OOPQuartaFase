package Prova;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    public double calcularBonus() {
        return getSalario() * 0.20;

    }
}


