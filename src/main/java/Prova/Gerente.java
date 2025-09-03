package Prova;

public class Gerente extends Funcionario{

    @Override
    public void calcularBonus(){
        salario+= salario * 0.20;
        System.out.println("Seu bonus de 20 por cento e igual a " + salario);
    }
}
