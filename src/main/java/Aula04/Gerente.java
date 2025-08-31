package Aula04;

public class Gerente extends Funcionario{
    protected String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }
    public void imprimirInfoGerente() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Salario: " + this.salario);
        System.out.println("Departamento: " + this.departamento);

    }
}
