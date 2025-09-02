package exercicio6;

public class Gerente extends Funcionario {
    public String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }
}
