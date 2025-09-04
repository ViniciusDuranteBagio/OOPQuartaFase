package Prova;

public class Gerente extends Funcionario{

    @Override
    public void bonus(){
        double salarioFinal = salario*1.2;
        System.out.println("nome funcionario: " + nome);
        System.out.println("Salario final: " + salarioFinal);

    }
}
