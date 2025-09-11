package polimorfismo.atividades.ativ1;

public class Desenvolvedor extends Funcionario {

    private int horasExtra;
    private double valorHoraExtra;

    public Desenvolvedor(String nome, double salarioBase, int horasExtra, double valorHoraExtra) {
        super(nome, salarioBase);
        this.horasExtra = horasExtra;
        this.valorHoraExtra = valorHoraExtra;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (horasExtra * valorHoraExtra);
    }
}
