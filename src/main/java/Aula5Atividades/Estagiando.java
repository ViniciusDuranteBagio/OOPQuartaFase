package Aula5Atividades;

public class Estagiando extends Funcionario {
    public Estagiando(String nome, double baseSalary) {
        super(nome,baseSalary);
    }
    @Override
    public double calcularSalario() {
        return baseSalary;
    }
}
