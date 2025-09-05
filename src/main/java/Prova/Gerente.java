package Prova;

public class Gerente extends Funcionario{
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }
    @Override
    public void calcularBonus() {
        System.out.println("O bonus é de R$ " + getSalario());
    }
}
