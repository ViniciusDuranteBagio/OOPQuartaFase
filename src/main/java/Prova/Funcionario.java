package Prova;

public class Funcionario {
    String nomeFuncionarioGuerreiro;
    double salarioFuncionarioGuerreiro;

    public Funcionario(String nome, double salario) {
        this.nomeFuncionarioGuerreiro = nome;
        this.salarioFuncionarioGuerreiro = salario;
    }

    public double calcularBonus() {
        return salarioFuncionarioGuerreiro * 0.10; 
    }
}
