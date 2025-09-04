package Prova;

public class Funcionario {
    public String nome;
    public double salario;

    public void CalcularBonus() {
        double dezPorCentoSalario = salario * 0.1;
        System.out.println("10% do seu Salario é: " + dezPorCentoSalario + " Reais!");
    }
}
