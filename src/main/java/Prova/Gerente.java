package Prova;

public class Gerente extends Funcionario{
    public Gerente(String nomeInicial, double salarioInicial) {
        super(nomeInicial, salarioInicial);
    }

    @Override
    public void calcularBonus() {
        System.out.println("O valor do bonus é: "+ getSalario() * 0.2);
    }
}
