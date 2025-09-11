package Aula5Atividades;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, double baseSalary) {
        super(nome, baseSalary);
    }
    @Override
    public double calcularSalario() {
        return baseSalary;
    }
}
