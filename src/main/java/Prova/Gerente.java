package Prova;

public class Gerente extends Funcionario{

        @Override
        public void CalcularBonus() {
            double dezPorCentoSalario = salario * 0.2;
            System.out.println("20% do seu Salario é: " + dezPorCentoSalario + " Reais!");
        }
    }
