package Prova;

public class Funcionario {

    public String nome = "Patrick";
    public double salario = 2300.00;

    void CalcularBonus(){
        double resultado = salario / 10;
        System.out.println("Meu nome é " + nome + " e recebo R$" + salario + " por mês" +
                "\n 10% do salario: " + resultado);
    }
}
