package polimorfismo.atividades.ativ1;

public class Estagiario extends Funcionario {

    private double bolsaAuxilio;

    public Estagiario(String nome, double salarioBase, double bolsaAuxilio) {
        super(nome, salarioBase);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + bolsaAuxilio;
    }
}
