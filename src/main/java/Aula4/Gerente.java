package Aula4;

public class Gerente extends Funcionario{
    String departamento;
    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public void aumentarSalario(double porcentagem) {
        double aumento = salario * porcentagem/100;
        salario += aumento;
        System.out.println("Salário atual: " + salario + "\nDepartamento: " + departamento);
    }

}
