package Prova;

public class Gerente extends Funcionario{


    public void CalcularBonusSalario(){
        double bonusSalario = salario * 0.20;
        System.out.println(nome + " Teve o bônus de R$ " + bonusSalario);
    }
}
