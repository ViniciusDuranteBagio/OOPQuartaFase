package Atividades.Aula4;

public class Gerente extends Funcionario{

    protected String departamento;

    Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento =  departamento;
    }
}
