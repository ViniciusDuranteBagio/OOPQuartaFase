package Atvd_aula6;

public class Calculadora {

    public double divisao (double num1, double num2){
        try {
            if (num2 == 0){
                throw new ArithmeticException("Não é possível realizar divisão por 0");
            }
            return num1 / num2;

        } catch (ArithmeticException e){
            System.out.println("Não é possivel dividir por 0");
            return 0;
        }

    }
}
