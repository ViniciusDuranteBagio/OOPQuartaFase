package Prova;

public class Gerente extends Funcionario {
    public Gerente(String nome, double salario){
        super(nome, salario);
    }

    @Override
    public void calcularBonus(){
        System.out.println("O bônus do gerente é de: R$" + getSalario() * 0.2);
    }
}
