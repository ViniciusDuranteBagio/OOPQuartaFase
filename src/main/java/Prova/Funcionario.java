package Prova;

public class Funcionario {
    String nome;
    double salario;

    public double calcularBonus() {
        return salario * 0.10;
    }
}

public class Gerente extends Funcionario {
    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }
}
}
