package Prova;

public class Gerente extends Funcionario{

    String nome = "Wallace Yan";
    double salario = 4000.00;
    void CalcularBonus(){
        double resultado = salario / 5;
        System.out.println("Meu nome é " + nome + " e recebo R$" + salario + " por mês" +
                "\n 20% do salario: " + resultado);
    }
}
