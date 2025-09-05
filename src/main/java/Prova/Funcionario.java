package Prova;

public class Funcionario {
    String nome;
    double salario;

    public void CalcularBonus(){
        double bonus = salario * 0.10;
        System.out.println(nome + " Teve o bônus de R$ " + bonus);

    }

}
