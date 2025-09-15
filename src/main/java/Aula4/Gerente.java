package Aula4;

//classe herda de funcionario
public class Gerente extends Funcionario{

    //atributo departamento
    private String departamento;

    //construtor da classe
    public Gerente(String nome, int idade, double salario, String departamento) {
        super(nome, idade, salario);
        this.departamento = departamento;
    }

    //metodo getter para puxar dados
    public String getDepartamento() {
        return departamento;
    }
}
