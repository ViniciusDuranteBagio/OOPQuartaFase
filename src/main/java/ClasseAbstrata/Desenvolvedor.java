package ClasseAbstrata;

public class Desenvolvedor extends Funcionario {
    private double adicionalPorProjeto;

    public Desenvolvedor(String nome, double salarioBase, double adicionalPorProjeto) {
        super(nome, salarioBase);
        this.adicionalPorProjeto = adicionalPorProjeto;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + adicionalPorProjeto;
    }
}
