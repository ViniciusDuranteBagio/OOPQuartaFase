package Funcionario;

public class Gerente extends Funcionario{
    public Gerente(String nome, double sal){
        super(nome, sal);

    }

    @Override
    public void calcularBonus() {
        super.porcentagem = 0.2;
        super.calcularBonus();


    }
}
