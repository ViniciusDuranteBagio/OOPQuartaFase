package AulaHeranca;

public class Gerente extends Funcionario {

    String departamento;

    public Gerente (String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }
    @Override   // vai sobreescrever
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Departamento: " + departamento);
    }
}
