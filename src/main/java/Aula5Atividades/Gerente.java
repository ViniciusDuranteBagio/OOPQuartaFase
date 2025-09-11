package Aula5Atividades;

public class Gerente extends Funcionario {
    public Gerente(String nome, double baseSalary) {
        super(nome, baseSalary);
    }
    @Override
    public double calcularSalario() {
        return baseSalary;
    }

}
