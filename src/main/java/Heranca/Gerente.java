package Heranca;

public class Gerente extends Funcionario {
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + ", Salário: " + salario + ", Departamento: " + departamento);
    }
}
